package SelfLearn.MyQuestionSet;

/**
 * Class BitwiseQuestions is created on 2019/12/15 22:03.
 *
 * @author Ray
 * @version 2019/12/15
 **/

public class BitwiseQuestions {

    public static void main(String[] args) {
        swapWithOutTmp(301, 534);
        System.out.println(count1(15));
        System.out.println(log2(3));
        System.out.println(log2(4));
        System.out.println(log2(16));
    }


    //1. 不用临时变量，交换两个整数？
    //一个数和另一个数异或两次得到的还是原来的数
    public static void swapWithOutTmp(int a, int b) {
        System.out.println("before: a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after: a = " + a + " b = " + b);
    }

    //2. 统计一个整数二进制中1的个数？
    //n & (n - 1)将整数n的最后一位为1的位变成0
    public static int count1(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            ++count;
        }
        return count;
    }

    //3. 不使用+，-，*，/完成整数相加
    public static int AddWithOutOp(int num1, int num2) {
        int sum, carry;
        do {
            //将两个数异或，模拟加法中相加不进位的结果
            sum = num1 ^ num2;
            //只考虑进位的情况
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        while (num2 != 0); //将结果相加的过程就重复上述过程，直到进位为0

        return sum;
    }

    //4. 判断一个数字是否为2 的幂次
    //如果⼀个数字是2 的幂次，那么只有最⾼位为1 ，也就是只需要判断这个数字减掉最⾼位之后是否为0 即可
    public static boolean log2(int num) {
        return (num & (num - 1)) == 0;
    }

    //5. 给定一个整数，请写一个函数判断该整数的奇偶性
    //一个数是偶数那么最后一个一定是 0 如果一个数是奇数那么最后一位一定是 1
    public boolean isOdd(int num){
        return (num & 1) != 0;
    }
}
