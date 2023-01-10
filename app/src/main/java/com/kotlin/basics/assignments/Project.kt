package com.kotlin.basics.assignments

fun main() {

    /*
    Create (Task) data class that holds these values: id, name, note and isCompleted.
    Then create (To Do) class that do the following:
        - Show all the tasks (Method)
        - Print specific task, One parameter of type Int
        - Add task, Parameter of type Task (Method)
        - Remove task, Parameter of type task (Method)
        - Change task, Parameter of type Task (Method)
    The Class has an array property called tasks of type (Task)
    which has a private set.
    */

    val task1 = Task(id = 1, name = "A", "Travel")
    val task2 = Task(id = 2, name = "B", "Swim")
    val todo = Todo()

    todo.addTask(task1)
    todo.addTask(task2)
    todo.changeTask(task1)
    todo.printTask(1)
}

data class Task(
    val id: Int,
    val name: String,
    val note: String,
    var isCompleted: Boolean = false
)

class Todo {

    var tasks = arrayListOf<Task>()
        private set

    fun printAll() {
        for (task in tasks) println(task)
    }

    fun printTask(id: Int) {
        // for ((taskID, _, note) in tasks) {
        //     if (taskID == id) println(note)
        // }

        for (task in tasks) {
            if (task.id == id) println(task)
        }
    }

    fun addTask(task: Task) = tasks.add(task)

    fun removeTask(task: Task) = tasks.remove(task)

    fun changeTask(task: Task) {
        task.isCompleted = !task.isCompleted
    }

}