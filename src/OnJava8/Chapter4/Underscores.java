package OnJava8.Chapter4;

/**
 * Class Underscores is created on 2020/1/27 16:49.
 *
 * @author Ray
 * @version 2020/1/27
 **/

public class Underscores {
    public static void main(String[] args) {
        double d = 341_435_936.455_677D;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin); //[1]
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);
    }

    //[1]注意 %n的使用。熟悉 C 风格的程序员可能习惯于看到 \n 来表示换行符。
    // 问题在于它给你的是一个“Unix风格”的换行符。
    // 此外，如果我们使用的是 Windows，则必须指定 \r\n。
    // 这种差异的包袱应该由编程语言来解决。
    // 这就是 Java 用 %n 实现的可以忽略平台间差异而生成适当的换行符，
    // 但只有当你使用 System.out.printf() 或 System.out.format() 时。
    // 对于 System.out.println()，我们仍然必须使用 \n；
    // 如果你使用 %n，println() 只会输出 %n 而不是换行符。
}
