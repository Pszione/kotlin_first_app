package com.ousedgames.kotlin_first_app

fun main(args: Array<String>) {

    // FOR LOOPS
    var sum01: Int = 0
    for (x in 0..5) {
        println(x)
        sum01 += x
    }
    println("Sum: $sum01")
    println("")

    var sum02: Int = 0
    for (y in 0..10) {
        if (y % 2 == 0) {
            println(y)
            sum02 += y
        }
    }
    println("Sum (even): $sum02")
    println("")

    // ARRAYS AND LOOPS
//    val numberArray = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    for (a in numberArray) {
//        println(a)
//    }

//    val numberArray = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    for (a in 0 until numberArray.size) { // 0..(numberArray.size - 1)
//        println("Item [$a] is ${numberArray[a]}")
//    }

    val numberArray = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (a in numberArray.indices) {
        println("Item [$a] is ${numberArray[a]}")
    }

    val stringsArray = arrayListOf<String>("a", "b", "c", "d", "E")
    stringsArray.forEach { println(it) }
}
