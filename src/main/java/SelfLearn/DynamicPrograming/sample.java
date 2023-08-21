package SelfLearn.DynamicPrograming;

/**
 * Class fib is created on 2019/12/6 18:07.
 *
 * @author Ray
 * @version 2019/12/6
 **/

class sample {


    //递归算法。这个算法会计算并且储存临时结果 但是会重复计算
    public static int fib(int n) {
        if (n <= 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    //动态规划
    public static int fibonacci(int n) {
        if (n <= 1)
            return 1;

        int last = 1;
        int nextToLast = 1;
        int ans = 1;

        for (int i = 2; i <= n; i++) {
            ans = last + nextToLast;
            nextToLast = last;
            last = ans;
        }
        return ans;
    }

    //计算C(N) = 2 * sum(C(0)+ ... +C(n-1)) / N + N; C(0) = 1;
    //递归
    public static double eval(int n) {
        if (n == 0)
            return 1.0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += eval(i);
        }
        return 2.0 * sum / n + n;
    }

    //保留计算结果，动态规划的最好方法应该是画分析图，储存或者动态的储存（带有更新操作）有用的数据（为下一步计算做准备的数据）
    //这就是动态规划。
    public static double evaluate(int n) {
        if (n == 0)
            return 1.0;
        double[] c = new double[n + 1];

        c[0] = 1.0;

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += c[i - 1];
            c[i] = 2.0 * sum / i + i;
        }
        return c[n];
    }

}
