package com.kotlin.basics

fun main() {

    // Functions is a piece of code that is called by name.
    addNumbers()

    // Argument is the data you pass into the function parameter ("Abdulrahman" is argument).
    printName("Abdulrahman")

    // No need to pass the second argument because it has a default value.
    multiplyNumber(5)

    // The value returned from the function can be stored into a variable
    val result = isBiggerThan(20.5, 34.3)
    println(result)

}

fun addNumbers() {
    val addition = 10 + 3
    println(addition)
}

// Parameter is a named variable passed into a function (name is parameter).
fun printName(name: String) {
    println("Hello $name")
}

// Parameters can have default values, which are used when you skip the corresponding argument.
fun multiplyNumber(number1: Int, number2: Int = 2) {
    println("Result: ${number1 * number2}")
}

// To return a value from a function, the returning value type must be specified (Boolean).
fun isBiggerThan(age1: Double, age2: Double): Boolean {
    val value = age1 > age2

    // The return keyword is used to return value to the caller of the function.
    return value
}