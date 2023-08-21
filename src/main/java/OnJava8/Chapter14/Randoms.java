package OnJava8.Chapter14;

import java.util.*;
import java.util.function.IntConsumer;

/**
 * Class Randoms is created on 2020/1/4 12:24.
 * 介绍了用流Stream和外部迭代的方法来输出几个随机数
 * @author Ray
 * @version 2020/1/4
 **/

public class Randoms {
    public static void main(String[] args) {
        IntConsumer intConsumer = System.out::println;
        ArrayList<Integer> arrayList = new ArrayList<>();
        new Random(47)
        .ints(5,20)
        .distinct()
        .limit(7)
        .sorted()
        .forEach(intConsumer.andThen(arrayList::add));

        arrayList.forEach(System.out::println);
    }
}

class ImperativeRandoms {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> sortedMap = new TreeSet<>();
        while (sortedMap.size() < 7){
            int r = rand.nextInt(20);
            if (r < 5) continue;
            sortedMap.add(r);
        }
        System.out.println(sortedMap);
    }
}
