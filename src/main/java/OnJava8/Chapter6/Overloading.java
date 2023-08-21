package OnJava8.Chapter6;

//Both constructor and ordinary method overloading

class Tree {
    int height;

    public Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    public Tree(int initialHeight) {
        this.height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
