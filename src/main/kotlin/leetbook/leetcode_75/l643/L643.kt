package leetbook.leetcode_75.l643

fun main() = with(Solution()) {
    println(findMaxAverage(intArrayOf(0, 4, 0, 3, 2), 1))
}


class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0
        repeat(k) {
            sum += nums[it]
        }
        var max = sum
        for (i in k until nums.size) {
            sum = sum - nums[i - k] + nums[i]
            max = Math.max(sum, max)
        }
        return max.toDouble() / k
    }
}