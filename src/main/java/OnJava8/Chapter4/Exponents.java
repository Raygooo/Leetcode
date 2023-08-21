package OnJava8.Chapter4;

/**
 * Class Exponents is created on 2020/1/27 16:53.
 *
 * @author Ray
 * @version 2020/1/27
 **/

public class Exponents {
    public static void main(String[] args) {
        //大写E和小写e的效果相同：
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f; //'f'是必须的
        System.out.println(expFloat);
        double expDouble = 47e47d; //'d'是可选的
        double expDouble2 = 47e47; //自动转换为double
        System.out.println(expDouble);
    }
}
