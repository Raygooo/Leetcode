package Test;

public class 中文类 {
    private int 数字 = 1;

    public 中文类(int 数字) {
        this.数字 = 数字;
    }

    public int get数字() {
        return 数字;
    }

    public static void main(String[] args) {
        中文类 zhongwen = new 中文类(2);
        System.out.println(zhongwen.get数字());
    }
}
