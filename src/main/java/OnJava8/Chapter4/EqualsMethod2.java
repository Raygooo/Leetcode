package OnJava8.Chapter4;

/**
 * Class EqualsMethod2 is created on 2020/1/27 15:55.
 *
 * @author Ray
 * @version 2020/1/27
 **/

class Value {
    int i;
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}
