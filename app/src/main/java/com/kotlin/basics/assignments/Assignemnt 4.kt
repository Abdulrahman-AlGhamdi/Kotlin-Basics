package com.kotlin.basics.assignments

fun main() {

    /* Q1:
    Write a function that accepts three parameters, two
    parameters of type doubles and one with parameter of type
    string. the string parameters has a default a argument of "+".
    the string parameter only accepts these arguments "+", "-", "*"
    and "/". check what is the value of the string and then do the
    corresponding mathematical operation.
    */

    math(number1 = 3.0, number2 = 5.5)
    math(number1 = 3.0, number2 = 5.5, "*")
    math(number1 = 3.0, number2 = 5.5, "-")
    math(number1 = 3.0, number2 = 5.5, "/")

}

fun math(number1: Double, number2: Double, operator: String = "+") {
    when (operator) {
        "+" -> println(number1 + number2)
        "-" -> println(number1 - number2)
        "*" -> println(number1 * number2)
        "/" -> println(number1 / number2)
        else -> println("This is not the correct operator")
    }
}