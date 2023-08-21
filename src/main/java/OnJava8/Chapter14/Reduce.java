package OnJava8.Chapter14;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Class Frobnitz is created on 2020/1/13 21:34.
 *
 * @author Ray
 * @version 2020/1/13
 **/

class Frobnitz {
    int size;

    public Frobnitz(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Frobnitz{" +
                "size=" + size +
                '}';
    }

    static Random rand = new Random(47);
    static final int BOUND = 100;

    static Frobnitz supply() {
        return new Frobnitz(rand.nextInt(BOUND));
    }
}

public class Reduce {
    public static void main(String[] args) {
        Stream.generate(Frobnitz::supply)
                .limit(10)
                .peek(System.out::println)
                .reduce(((frobnitz, frobnitz2) -> frobnitz.size < 50 ? frobnitz : frobnitz2))
                //只要发现第一个小于50的对象就返回一个option包装上这个对象
                .ifPresent(o->{
                    System.out.println();
                    System.out.println("--- result of reduce ---" );
                    System.out.println(o);
                });
    }
}

