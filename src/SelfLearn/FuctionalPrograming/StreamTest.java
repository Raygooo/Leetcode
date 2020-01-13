package SelfLearn.FuctionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Class StreamTest is created on 2019/12/31 12:03.
 *
 * @author Ray
 * @version 2019/12/31
 **/

public class StreamTest {
    public static void main(String[] args) {
        /*创建Stream的几种方式*/

        //创建空的Stream对象
        Stream stream = Stream.empty();

        //通过集合类中的Stream()方法或者parallelStream()方法来创建
        List<String> list  = new ArrayList<>(Arrays.asList("a","b","c"));
        Stream listStream = list.stream();
        Stream parallelListStream = list.parallelStream();

        //通过Stream中的of方法来创建
        Stream stream2 = Stream.of("a");


    }
}
