package Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) throws IOException {
//        byte[] a = new byte[]{1,2};
//        byte[] b = new byte[]{1,2};
//        byte c = 3;
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        byteArrayOutputStream.write(a);
//        byteArrayOutputStream.write(b);
//        byteArrayOutputStream.write(c);
//        System.out.println(Arrays.toString(byteArrayOutputStream.toByteArray()));
//        byteArrayOutputStream.close();

        byte[] source = new byte[]{0, 1, 2, 3, 4, 5};
        byte part1 = source[0];
        byte[] part2 = new byte[5];

        System.arraycopy(source, 1, part2, 0, part2.length);
        System.out.println(Arrays.toString(part2));

        byte b = 1;
        switch (b) {
            case EnumTest.IDM:

        }

    }

    public enum EnumTest{
        IDM((byte)1);

        byte aByte;
        EnumTest(byte b) {
            aByte = b;
        }

        public byte getaByte() {
            return aByte;
        }
    }
}
