package com.ousedgames.kotlin_first_app

fun main(args: Array<String>) {

    // Console readLine()
    /*print("Please type in the console: ")
    val username: String? = readLine()
    println("User inserted: $username")*/

    // CONDITIONAL
    /*print("Please type a Number in the console: ")
    val userNumber:Int = readLine()!!.toInt()
    fun isEvenOrOdd(number:Int): String {
        return if(number % 2 == 0){
            "even"
        } else {
            "odd"
        }
    }
    println("User inserted: $userNumber | Number is ${isEvenOrOdd(userNumber)}")*/

    // WHEN/SWITCH CONDITIONAL
    println("Please type a day number of week (1 to 7): ")
    val dayNumber:Int = readLine()!!.toInt()

    var day:String = when(dayNumber)
    {
        // Kotlin lambda
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day choice!"
    }
    println("it's $day")
}