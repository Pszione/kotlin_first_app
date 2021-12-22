package com.ousedgames.kotlin_first_app

import kotlin.random.Random

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

    // ARRAYS AND FOR AND FOREACH
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

    // WHILE
    var ex = 50
    while (ex < 55) {
        println(ex)
        ex++
    }

    // factorial e.g: 3 --> 3*2*1=6 | 5 --> 5*4*3*2*1=120
    var k = 1
    var fact = 1 // TODO: readLine()!!.toInt()
    while (k <= 5) {
        fact *= k // fact = fact * k
        k++
        println("$k! = $fact") // sout snippet
    }

    // random guess
    fun generateNewRand(): Int {
        return Random.nextInt(0, 100)
    }

    var rnd: Int = generateNewRand()

    while (true) {
        println("Please enter a number: ")
        val userGuess: Any = readLine()!!
        if (userGuess.toString() == rnd.toString()) {
            println("Congratulations! You know the number on my mind!")
            rnd = generateNewRand()
        }
        /*else if(userGuess < rnd) {
            println("Increase your guess...")
        }*/
        /*else if (userGuess > rnd) {
            println("Decrease your guess...")
        }*/
        //
        else if (userGuess is String && userGuess == "help") {
            println("Answer: $rnd")
        }
//        break
    }
}
