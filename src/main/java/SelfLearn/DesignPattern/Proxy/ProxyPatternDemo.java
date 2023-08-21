package SelfLearn.DesignPattern.Proxy;

/**
 * Class ProxyPatternDemo is created on 2019/12/12 22:18.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class ProxyPatternDemo {

    //代理模式就是想在访问一个类的时候做一些控制，比如这里就是希望保存住代理对象，第二次调用的时候不需要重新初始化


    public static void main(String[] args) {
        Image image = new ProxyImage("test_Image");
        //需要加载
        image.display();
        System.out.println();
        //不需要加载
        image.display();
    }
}
