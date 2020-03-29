package Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Class Test.test is created on 2019/12/3 9:58.
 *
 * @author Ray
 * @version 2019/12/3
 **/

public class test {
    transient public int a;

    public static void main(String[] args) {

        int a =2,b=-1,c=2;
        if (a < b)
            if (b < 0)
                c = 0;
            else c++;
        System.out.println(c);

    }

}
