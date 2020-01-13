package SelfLearn.OnJava8.Chapter14_StreamPrograming;

/**
 * Class SelectElement is created on 2020/1/13 21:55.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class SelectElement {
    public static void main(String[] args) {
        System.out.println(RandInts.rands().findFirst().getAsInt());
        System.out.println(RandInts.rands().parallel().findFirst().getAsInt());
        System.out.println(RandInts.rands().findAny().getAsInt());
        System.out.println(RandInts.rands().parallel().findAny().getAsInt());//非固定选择

    }
}
