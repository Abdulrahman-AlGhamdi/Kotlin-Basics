package com.kotlin.basics.assignments

fun main() {

    /* Q1:
    Write a for loop that runs from 0 to 100
    and Once it's at 71 it should print "IT'S OVER 70!!!"
    */

    for (number in 0..100) {
        if (number == 71) println("IT'S OVER 70!!!")
        else println(number)
    }

    /* Q2:
    The temperature variable is initialized with 35.
    Write a while loop that checks temperature of the room
    and decrease the temperature by 1 every iteration until 10.
        - print "It’s Hot" when the temperature is 30
        - print "It’s Comfy" when the temperature is 20
        - print "IT'S COLD!!!" when the temperature is 15
        - else print just the temperature value
    */

    var temperature = 35

    while (temperature >= 10) {

        when (temperature) {
            30 -> println("It’s Hot")
            20 -> println("It’s Comfy")
            15 -> println("IT'S COLD!!!")
            else -> println(temperature)
        }

        temperature--
    }
}