package leetbook.leetcode_75.l2215

fun main() = with(Solution()) {
    println(findDifference(intArrayOf(1, 2, 3), intArrayOf(2, 4, 6)))
}

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val res1 = nums1.toMutableSet()
        val res2 = nums2.toMutableSet()
        nums2.filter {
            it in res1
        }.forEach {
            res1.remove(it)
            res2.remove(it)
        }
        return listOf(res1.toList(), res2.toList())
    }
}