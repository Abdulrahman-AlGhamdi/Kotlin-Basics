package com.kotlin.basics.assignments

fun main() {

    /* Q1:
    Write a program that adds five Numbers (Double) to an array
    and then calculates the average of those numbers.
    NOTE: Please use a for (in) loop in this exercise.
    */

    val numbers = arrayListOf<Double>()

    var counter = 1.0
    for (i in 1..5) numbers.add(++counter)

    // Solution 1:
    var average = 0.0
    for (i in numbers) average += i
    println(average / numbers.size)

    // Solution 2:
    println(numbers.average())

}