package OnJava8.Chapter14;

/**
 * Class Operations is created on 2020/1/8 13:54.
 *
 * @author Ray
 * @version 2020/1/8
 **/

@FunctionalInterface
public interface Operations {
    void execute();

    static void runOps(Operations... ops) {
        for(Operations op : ops)
            op.execute();
    }

    static void show(String msg) {
        System.out.println(msg);
    }
}

