package OnJava8.Chapter3;

/**
 * Class ShowProperties is created on 2020/1/16 18:08.
 *
 * @author Ray
 * @version 2020/1/16
 **/

public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println("-----------------------");
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
