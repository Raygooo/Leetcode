package OnJava8.Chapter14;

/**
 * Class Informational is created on 2020/1/13 22:03.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class Informational {
    public static void main(String[] args) throws Exception {
        System.out.println(
                FileToWords.stream("Cheese.dat").count()
        );
        System.out.println(
                FileToWords.stream("Cheese.dat")
                        .min(String.CASE_INSENSITIVE_ORDER)
                        .orElse("Nothing in here!")
        );
        System.out.println(
                FileToWords.stream("Cheese.dat")
                        .max(String.CASE_INSENSITIVE_ORDER)
                        .orElse("NONE")
        );
    }
}
