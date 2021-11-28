package com.ousedgames.kotlin_first_app

fun main(args: Array<String>) {

    var a = 10
    var b = 20
    var c = a + b

    println(c) // sout shortcut
    println(b + a) // sout shortcut

    /* var age = 100
     var _age = 110
     var a ge = 120
     var 3age = 130*/

    // VAR
    var age = 100
    age = 10
    println(age)
    // VAL
    val year = 2020
    // year = 2030 // val cannot be reassigned

    // DATA TYPES
    // Sizes
    // Double (8) > Float > Long > Integer > Short > Byte/Boolean
    var a1: Boolean = true
    var b1: Char = 'R'
    var c1: Byte = 12
    var d1: Short = -356
    var e1: Int = 43567
    var f1: Long = -999999L
    var g1: Float = 5.111F
    var h1: Double = 7.321
    println("$a1 $b1 $c1 $d1")
    println("$e1 $f1 $g1 $h1")

    // TYPE CASTING/CONVERSION
    val a2: Byte = 127
    val b2 = a2.toInt()
    val c2 = b2.toDouble()
    println("$a2 + $b2 = ${c2 * 2}")

    val d2: Double = 999999.9
    println(d2.toInt().toShort())

    // ARRAYS
    var ageArray = arrayOf(10, 20, 30)
    println("Age List: ${ageArray.joinToString()}")

    var carArray = arrayOf("Mercedes", "BMW", "Renault")
    carArray.set(2, "Nissan")
    println("Car List: ${carArray.joinToString()}")
    println(carArray.size)
    println(carArray.count())

    var anyDataList =
        arrayOf(ageArray[0], ageArray[1], ageArray[2], carArray[0], carArray[1], carArray[2])
//    anyDataList.set(6, true)
    println(anyDataList.joinToString())

    var intDataArrayList = ArrayList<Any>() // dynamic
    intDataArrayList.add(80)
    intDataArrayList.add(90)
    intDataArrayList.add(100)
    intDataArrayList.add("Pedro")
    intDataArrayList.add("Santos")
    intDataArrayList.add("is fun!")
    println(intDataArrayList.size)
    println(intDataArrayList.joinToString())

    // range.to() and in
    val myCharRange = 'a'.rangeTo('k')
    val charExists = 'k' in myCharRange
    println("Range is: " + myCharRange.joinToString())
    println("Range contains 'k': $charExists")

    // SET
    var setFake = arrayListOf<Any>("Brasil", "Russia", "Russia")
    println(setFake.last())
    println(setFake)

    var set1 = setOf<String>("Russia", "Brasil", "Brasil")
    println(set1.last())
    println(set1) // Repeated element was automatically deleted "Brasil"

    // MAP: Key value pars
    var map1 = mapOf<String, Any>("david" to 20, "luiz" to 25, "laura" to 30);
    println(map1.toList())
    println(map1["luiz"])
    var map2Mutable = mutableMapOf<String, Any>("suzuki" to 50000.0, "Ferrari" to 468000.0);
    map2Mutable.put("Koenigsegg", 2500000.0)
    println(map2Mutable.toList())
    println(map2Mutable.get("Koenigsegg"))

    // OPERATORS and ASSIGNMENTS
    var a3: Int = 20
    var b3: Int = 15
    var c3: Int = 0

    c3 = a3 + b3
    println("Sum +: $c3")
    c3 +=a3
    println("Sum +=: $c3")

    c3 *= 10
    println("Sum *= 10: $c3")
    c3 /= b3
    println("Sum /=: $c3")
    c3 %= b3 // modulus operand = c3 = c3 % b3
    println("Sum %= $b3: $c3")

    // UNARY OPERATORS
    var unaryNumber:Double = 7.6
    var negativeNumber:Int = -1
    var isUnaryCheck:Boolean = true

    println("+number = " + +unaryNumber)
    println("-number = " + -unaryNumber)
    println("+negative = " + +negativeNumber.unaryPlus()) // FAIL
    println("++number = " + ++unaryNumber)
    println("--number = " + --unaryNumber)
    println("!isCheck = " + !isUnaryCheck)
    // Suffix and Prefix
    println("number++ = " + unaryNumber++)
    println("number = " + unaryNumber)
    println("++number = " + ++unaryNumber)
    println("number = " + unaryNumber)
}