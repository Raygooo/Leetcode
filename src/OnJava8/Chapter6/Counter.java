package OnJava8.Chapter6;

/**
 * Class Counter is created on 2020/6/4 23:07.
 *
 * @author Ray
 * @version 2020/6/4
 **/

public class Counter {
    int i;
    int j = 22;

    public Counter() {
        this.i = 7; // i首先会被初始化为0，然后变为7
        //对于所有的基本类型和引用，包括在定义的时候已经明确初始值的变量，
        //都会被初始化。 编译器不会强制你一定要在构造器的某个地方或者在使用他们之前
        //初始化这些元素--因为初始化早就已经完成了。
    }
}
