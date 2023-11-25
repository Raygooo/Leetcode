package leetbook.leetcode_75.l199

import common.structure.TreeNode
import java.util.*

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        root ?: return emptyList()
        val res = mutableListOf<Int>()
        val queue: Queue<TreeNode> = LinkedList<TreeNode>()
        queue.offer(root)
        res.add(root.`val`)
        while(queue.size != 0) {
            val size = queue.size
            repeat(size) { _ ->
                val node = queue.poll()
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
            queue.lastOrNull()?.let{ res.add(it.`val`) }
        }
        return res
    }
}