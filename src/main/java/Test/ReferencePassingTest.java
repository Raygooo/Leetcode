package Test;

/**
 * Class TEST2 is created on 2019/12/23 0:34.
 * 这个test是为了证明传入方法的参数实际上是个引用的备份，不论你如何在方法中变换指向都不会对这个参数的实际引用造成影响。
 * @author Ray
 * @version 2019/12/23
 **/

public class ReferencePassingTest {

    public static void setValue(String str) {
        str = "ss";
    }

    public static void setValue(Man man) {
        man = new Man("test");
    }

    public static void setNextMan(Man man) {
        man.nextMan = new Man("women");
    }

    public static class Man {
        public Man nextMan;
        private String name;
        public static String name2 = "Man";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Man(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Man{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void set(int a) {
        a = 5;
    }

    public static void main(String[] args) {

        String str = "s";
        setValue(str);

        System.out.println(str);


        Man man = new Man("SuperMan");
        setValue(man);
        System.out.println(man);
        setNextMan(man);
        System.out.println(man.nextMan);
        int a = 10;


    }
}
