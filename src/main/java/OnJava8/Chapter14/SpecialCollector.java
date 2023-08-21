package OnJava8.Chapter14;

import java.util.ArrayList;

/**
 * Class SpecialCollector is created on 2020/1/13 21:16.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class SpecialCollector {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = FileToWords.stream("Cheese.dat")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        words.stream().filter(s -> s.equals("cheese")).forEach(w -> System.out.printf("%s ", w));
    }
}
