package SelfLearn.OnJava8.Chapter14;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Class Signal is created on 2020/1/13 19:10.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class Signal {
    private final String msg;

    public Signal(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Signal{" +
                "msg='" + msg + '\'' +
                '}';
    }

    static Random rand = new Random(47);

    public static Signal morse() {
        switch (rand.nextInt(4)) {
            case 1:
                return new Signal("dot");
            case 2:
                return new Signal("dash");
            default:
                return null;
        }
    }

    public static Stream<Optional<Signal>> stream() {
        return Stream.generate(Signal::morse)
                .map(Optional::ofNullable);
    }
}
