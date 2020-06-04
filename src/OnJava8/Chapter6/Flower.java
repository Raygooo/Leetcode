package OnJava8.Chapter6;

/**
 * Class Flower is created on 2020/6/4 22:07.
 *
 * @author Ray
 * @version 2020/6/4
 **/

public class Flower {
    int petalCount = 0;
    String s = "initial value";


    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ string arg only, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
//        -this(s); // 不能同时调用两个构造器方法 //另外必须首先调用this()
        this.s = s; //this.s 来说明成员变量身份 避免混淆
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("no-arg constructor");
    }

    void printPetalCount() {
//        -this(11); // 不能在除了构造器方法里面用this()
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
