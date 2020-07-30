package Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) throws IOException {

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
