package Test;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
    }
    static class Parent {
        protected void speak() {
            System.out.println("parent speak");
        }
    }

    static class Child extends Parent {
        @Override
        public void speak() {
            System.out.println("child speak");
        }
    }
}