package com.kotlin.basics.exercises

fun main() {

    /*
    Write an array that consists of 4 elements
    1 String
    2 Int
    3 Double
    4 Boolean
    * */

    val array = arrayListOf(true, "Ahmed", 1, 5.5, false)

    /*
    then loop through the elements of the array
    and print the corresponding type of each element
    * */

    for (element in array) {
        when (element) {
            is String -> println("String")
            is Int -> println("Int")
            is Double -> println("Double")
            is Boolean -> println("Boolean")
            else -> println("Other")
        }
    }

}
