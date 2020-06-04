package OnJava8.Chapter6;

/**
 * Class MethodInit2 is created on 2020/6/4 23:04.
 *
 * @author Ray
 * @version 2020/6/4
 **/

public class MethodInit2 {
    //    -int k = g(i); 、、Illegal forward reference
    int i = f();
    int j = g(i);

    int f() {
        return 11;
    }

    int g(int n) {
        return n ^ 2;
    }
}
