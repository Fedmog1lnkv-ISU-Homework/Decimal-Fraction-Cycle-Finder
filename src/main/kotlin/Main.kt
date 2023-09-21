fun calculateRemainderLength(divider: Int): Int {
    var len = 0
    var numerator = 1
    val remainders = IntArray(1000)

    while (numerator != 0 && remainders[numerator] == 0) {
        remainders[numerator] = len
        numerator = numerator * 10 % divider
        len++
    }

    return if (numerator == 0) 0 else len - remainders[numerator]

}

fun main() {
    var maxLen = -1
    var number = -1


    for (i in 3..999) {
        val curLen = calculateRemainderLength(i)
        if (curLen > maxLen) {
            maxLen = curLen
            number = i
        }
    }

    println("Number: \t$number")
    println("Max len: \t$maxLen")
}