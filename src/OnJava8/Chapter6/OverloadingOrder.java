package OnJava8.Chapter6;

//根据参数顺序不同来重载方法，这样写维护起来会比较困难。
//自己写代码的时候往往不那么注意参数的顺序，而比较注重参数的类型，数量。
public class OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + " String: " + s);
    }

    public static void main(String[] args) {
        f("String at first", 1);
        f(2, "String at last");
        f(3,"String at last");
    }
}
