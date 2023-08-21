package Test.TransientTest;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Class TestInterview is created on 2020/4/3 19:24.
 *
 * @author Ray
 * @version 2020/4/3
 **/

public class TestInterview {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        String a = in.nextLine();
        String b = in.nextLine();
        StringBuilder stringBuilder = new StringBuilder("");
        System.out.println(isRotated(a, n, b, m));


    }

    public static String isRotated(String a, int n, String b, int m) {
        if (n != m)
            return "NO";
        boolean isR = false;

        for (int i = 0; i < n; i++) {
            if (b.equals(rotate(a, 1))) {
                isR = true;
                break;
            }
        }

        return isR ? "YES" : "NO";
    }

    public static String rotate(String s, int offset) {
        char[] chars = s.toCharArray();
        LinkedList<Character> charsList = new LinkedList<>();
        for (char c : chars) {
            charsList.add(c);
        }

        for (int i = 0; i < offset; i++) {
            char c = charsList.remove(charsList.size() - 1);
            charsList.addFirst(c);
        }

        StringBuilder sb = new StringBuilder("");

        for (char c : charsList) {
            sb.append(c);
        }

        return sb.toString();
    }
}
