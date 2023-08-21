package Test.TransientTest;

public class FinallyOverrideCatch {
    public static void main(String[] args) {
        System.out.println(FOCTest());
        System.out.println(FOCTest2());
    }

    public static int FOCTest() {
        try {
            throw new Exception("there is an exception");
        } catch (Exception e) {
            return 1;
        }
    }

    public static int FOCTest2() {
        try{
            throw new Exception("there is an exception");
        } catch (Exception e) {
            return 1;
        }finally {
            return 2;
        }
    }
}
