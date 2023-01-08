package com.kotlin.basics

fun main() {

    // while: loops through a block of code as long as a the condition is true.

    var counter = 0

    while (counter < 5) {
        println("Counter: $counter")
        counter++
    }

    // do while: execute the code block once before checking the condition

    var temperature = 4

    do {
        println("Temperature: $temperature")
        temperature--
    } while (temperature > 0)

    // for loop: is used to loop through arrays and ranges. It used together with the (in) keyword.

    // (..) is used create range between two numbers (small number to big number)
    for (number in 0..3) {
        println("Number: $number")
    }

    // (downTo) is used create range between two numbers (big number to small number)
    for (season in 4 downTo  1) {
        println("Season: $season")
    }

    // (step) is used to go through number with extra steps instead of one step everytime
    for (month in 1..12 step 2) {
        println("Month: $month")
    }

}