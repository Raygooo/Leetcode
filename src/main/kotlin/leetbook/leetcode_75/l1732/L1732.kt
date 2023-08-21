package leetbook.leetcode_75.l1732

fun main() = with(Solution()) {
    println(largestAltitude(intArrayOf(-5,1,5,0,-7)))
}

class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var max = 0
        var alt = 0
        for (g in gain) {
            alt += g
            max = Math.max(max, alt)
        }
        return max
    }
}