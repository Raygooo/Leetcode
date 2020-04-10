package OnJava8.Chapter6;

/**
 * Class Rock is created on 2020/3/2 22:17.
 *
 * @author Ray
 * @version 2020/3/2
 **/

/**
 * 构造器可以用来保证每个对象的初始化
 */
//a simple constructor
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}
