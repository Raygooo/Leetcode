package LeetCode.Q0204;

/**
 * Class Q0204 is created on 06/08/2019 22:45.
 *
 * @author Ray
 * @version 06/08/2019
 **/

public class Q0204 {
}

class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                count++;
        }
        return count;
    }

    /**
     * this method is from the internet
     */
    public boolean isPrime(int num) {
        if (num <= 3) {
            return num > 1;
        }
        //质数总是等于 6x-1 或者 6x+1，其中 x 是大于等于1的自然数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        //假如n是合数，必然存在非1的两个约数p1和p2，其中p1<=sqrt(n)，p2>=sqrt(n)
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}


/**
 * from leetcode
 * <p>
 * 每次检查一个数的时候，都都把这个数和其他数的乘积（小于 n）放进一个boolean数组
 * <p>
 * 对比操作效率很高
 * <p>
 * 越循环，循环的数量越少
 * <p>
 * 提醒我设置布尔变量，能减少运算
 */
class Solution1 {
    public int countPrimes(int n) {
        boolean[] check = new boolean[n];
        //默认false
        int res = 0;
        for (int i = 2; i < n; i++) {
            if (!check[i]) {
                for (int j = 2; j * i < n; j++) {
                    if (!check[j * i])
                        check[j * i] = true;
                }
                res++;
            }
        }
        return res;
    }
}
