package OnJava8.Chapter5;

/**
 * Class ListCharacters is created on 2020/2/26 20:38.
 *
 * @author Ray
 * @version 2020/2/26
 **/

public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c))
                System.out.println("value: " + (int) c + " character: " + c);
        }
    }
}
