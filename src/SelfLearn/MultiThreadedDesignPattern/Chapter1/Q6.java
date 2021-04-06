package SelfLearn.MultiThreadedDesignPattern.Chapter1;

public class Q6 {
    public static void main(String[] args) {
        Tool fork = new Tool("fork");
        Tool spoon = new Tool("spoon");
        ToolBox toolBox = new ToolBox(fork, spoon);

        new EaterThread("Alice", toolBox).start();
        new EaterThread("Tom", toolBox).start();
    }
}

class Tool {
    private final String name;

    public Tool(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }
}

class ToolBox {
    public final Tool left;
    public final Tool right;

    public ToolBox(Tool left, Tool right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "ToolBox{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

class EaterThread extends Thread {
    private final String name;

    private final ToolBox toolBox;

    public EaterThread(String name, ToolBox toolBox) {
        this.name = name;
        this.toolBox = toolBox;
    }

    @Override
    public void run() {
        while (true) {
            eat();
        }
    }

    private void eat() {
        synchronized (toolBox) {
            System.out.println(name + " takes up " + toolBox.left + " (left)");
            System.out.println(name + " takes up " + toolBox.right + " (right)");
            System.out.println(name + " is eating now, yum, yum!");
            System.out.println(name + " put down " + toolBox.right + " (right)");
            System.out.println(name + " put down " + toolBox.left + " (left)");
        }
    }
}
