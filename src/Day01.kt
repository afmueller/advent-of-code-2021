fun main() {
    fun part1(input: List<Int>): Int {
        var result = 0
        var prev = 99999
        for (s in input) {
            if (s > prev) { result += 1}
            prev = s
            }

        return result
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
