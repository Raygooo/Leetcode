package leetbook.leetcode_75.l1926

import java.util.LinkedList
import java.util.Queue
import kotlin.collections.HashSet

fun main() = with(Solution()) {}

typealias Point = IntArray

class Solution {

    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        val queue: Queue<Point> = LinkedList()
        queue.offer(entrance)
        var steps = 0
        val visited = HashSet<Int>()
        while (queue.isNotEmpty()) {
            val size = queue.size
            repeat(size) {
                val point = queue.poll()
                if (point.isExit(maze, entrance)) return steps
                with(point) {
                    queue.offerIfNotWallOrNullOrVisited(maze, visited,
                            upOrNull(maze),
                            downOrNull(maze),
                            leftOrNull(maze),
                            rightOrNull(maze)
                    )
                }
            }
            steps++
        }
        return -1
    }

    private fun Point.encode() = x + 1000 * y

    private fun Queue<Point>.offerIfNotWallOrNullOrVisited(maze: Array<CharArray>, visited: HashSet<Int>, vararg points: Point?) {
        points.forEach { point ->
            point ?: return@forEach
            if (point.isWall(maze)) return@forEach
            if (point.encode() in visited) return@forEach
            visited.add(point.encode())
            offer(point)
        }
    }

    private fun Point.isExit(maze: Array<CharArray>, entrance: Point): Boolean {
        if (entrance.x == x && entrance.y == y) return false
        return (x == 0 || x == maze.size - 1 || y == 0 || y == maze[0].size - 1)
    }

    private fun Point.isWall(maze: Array<CharArray>): Boolean {
        return maze[x][y] == '+'
    }

    private fun Point.leftOrNull(maze: Array<CharArray>): Point? {
        if (x - 1 !in maze.indices) return null
        return intArrayOf(x - 1, y)
    }

    private fun Point.rightOrNull(maze: Array<CharArray>): Point? {
        if (x + 1 !in maze.indices) return null
        return intArrayOf(x + 1, y)
    }

    private fun Point.upOrNull(maze: Array<CharArray>): Point? {
        if (y + 1 !in maze[0].indices) return null
        return intArrayOf(x, y + 1)
    }

    private fun Point.downOrNull(maze: Array<CharArray>): Point? {
        if (y - 1 !in maze[0].indices) return null
        return intArrayOf(x, y - 1)
    }

    private val Point.x
        get() = get(0)
    private val Point.y
        get() = get(1)
}

