package OnJava8.Chapter6;

/**
 * Class SimpleConstructor2 is created on 2020/3/2 22:23.
 *
 * @author Ray
 * @version 2020/3/2
 **/

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }
}

class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}
