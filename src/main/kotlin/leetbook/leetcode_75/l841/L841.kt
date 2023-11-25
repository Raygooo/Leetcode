package leetbook.leetcode_75.l841

import java.util.HashSet
import java.util.LinkedList
import java.util.Queue

class Solution {

    val visited = HashSet<Int>()

    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        dfs(rooms, 0)
        return visited.size == rooms.size
    }

    private fun dfs(rooms: List<List<Int>>, key: Int) {
        if (rooms.isEmpty()) return
        visited.add(key)
        rooms[key].forEach {
            if (it !in visited) dfs(rooms, it)
        }
    }
}