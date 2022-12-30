fun main() {
    print(solution(5))
}

fun solution(k: Int): Int {
    var sumOdd = 0
    var sumEven = 0
    for (i in 1 until k + 1) {
        if (i % 2 == 0) {
            sumEven += (i * i)
        } else {
            sumOdd += (i * i)
        }
    }

    return sumEven - sumOdd
}
