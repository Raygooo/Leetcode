package SelfLearn.DesignPattern.Singleton;

/**
 * Class Singleton is created on 2019/12/12 21:15.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class Singleton {
    private static Singleton instance;// == new Singleton(); 不过以下的做法是一种延迟实例化的方式，就是用的时候在实例化

    //构造器私有化 强化Singleton属性
    private Singleton() throws IllegalAccessException {
        if (instance != null)
            throw new IllegalAccessException("singleton already exist, illegal access to private constructor");
    }

    public static Singleton getInstance(){
        //****************延迟实例化的代码******************//
        if (instance == null)
            synchronized (Singleton.class) { /*确保线程安全*/
                try {
                    instance = new Singleton();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        //******************//
        return instance;
    }

}
