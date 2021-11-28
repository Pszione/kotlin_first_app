package com.ousedgames.kotlin_first_app

fun main(args: Array<String>) {

    // Console readLine()
    /*print("Please type in the console: ")
    val username: String? = readLine()
    println("User inserted: $username")*/

    // CONDITIONAL
    print("Please type a Number in the console: ")
    val userNumber:Int = readLine()!!.toInt()
    fun isEvenOrOdd(number:Int): String {
        return if(number % 2 == 0){
            "even"
        } else {
            "odd"
        }
    }
    println("User inserted: $userNumber | Number is ${isEvenOrOdd(userNumber)}")
}