package com.kotlin.basics.exercises

fun main() {

    /*
    Write a function that accepts one parameter of type string
    then return the second last letter from this parameter
    * */

    add(5, 3.0)

}

fun add(number1: Int, number2: Double) {
    val result = number1 / number2
    val string = result.toString()

    for (s in string) {
        println(s)
    }
}