package OnJava8.Chapter23.annotations.database;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("arguments: annotated classes");
            System.exit(0);
        }
        for (String className : args) {
            Class<?> c1 = Class.forName(className);
            DBTable dbTable = c1.getAnnotation(DBTable.class);
            if (dbTable == null) {
                System.out.println("No DBTable annotations in class" + className);
                continue;
            }
            String tableName = dbTable.name();
            // If the name is empty, use the Class name;
            if (tableName.length() < 1) {
                tableName = c1.getName().toUpperCase();
            }
            List<String> columnDefs = new ArrayList<>();
            for (Field field : c1.getDeclaredFields()) {
                String columnName = null;
                Annotation[] anns = field.getDeclaredAnnotations();
                if (anns.length < 1) {
                    continue; //Not a db table column
                }
                if (anns[0] instanceof SQLInteger) {
                    SQLInteger sInt = (SQLInteger) anns[0];
                    // Use field name if name not specified
                    if (sInt.name().length() < 1) {
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sInt.name();
                    }
                }
            }
        }

    }

}
