fun main() {
    val numberList: IntArray = intArrayOf(35, 42, 65, 24, 76, 98)
    println(Sum(numberList))
    println(Palindrome("racecar"))
}

fun Sum(array: IntArray): Int{
    var SumArr = 0
    for(number in array.indices) {
        if (number % 2 == 1) {
            SumArr += array[number]
        }
    }
    return SumArr
}

fun Palindrome(value: String): Boolean{
    var random  = value.reversed()
    return random.equals(value)
}

