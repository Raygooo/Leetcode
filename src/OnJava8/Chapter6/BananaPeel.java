package OnJava8.Chapter6;


class Banana {
    void peel(int i) {

    }
}

public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(), b = new Banana();
        a.peel(1); // Banana.peel(a, 1) //这是内部实现，不可以这么直接写代码，编译器不会接受
        b.peel(2); // Banana.peel(b, 2)
    }
}
