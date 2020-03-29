package Test;

/**
 * Class demo is created on 2020/2/29 18:08.
 *
 * @author Ray
 * @version 2020/2/29
 **/

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//请输入字符串
        System.out.println("请输入数据:");
        String s = sc.nextLine();
        String[] strarry = s.split("\\d");

        char[] chs = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (String str : strarry) {
            sb.append(str);
        }
        for (char c : chs) {
            if (c <= '9' && c >= '0') {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

    }

}