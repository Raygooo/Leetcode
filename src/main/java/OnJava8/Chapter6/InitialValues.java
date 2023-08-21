package OnJava8.Chapter6;

/**
 * Class InitialValues is created on 2020/6/4 22:58.
 *
 * @author Ray
 * @version 2020/6/4
 **/


public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    String string;
    InitialValues reference;

    void printInitialValues() {
        System.out.println("Data type Initial id");
        System.out.println("boolean " + t);
        System.out.println("char[" + c + "]");
        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("long " + l);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("reference " + reference);
        System.out.println("String [" + string + "]");
    }

    public static void main(String[] args) {
        new InitialValues().printInitialValues();
    }
}
