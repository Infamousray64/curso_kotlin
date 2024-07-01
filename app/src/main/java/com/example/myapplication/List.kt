package com.example.myapplication

fun main() {

    //inmutableList()
    mutableList()

}

fun mutableList() {

    val weekDays: MutableList<String> =
        mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    weekDays.add(3, "New Day")
    println(weekDays)

    if (weekDays.isEmpty()) {
        //no imprime nada
    } else {
        weekDays.forEach { println(it) }
    }

    if (weekDays.isNotEmpty()) {
        weekDays.forEach { println(it) }

    }

    fun inmutableList() {
        val readOnly: List<String> =
            listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        //println(readOnly.size)
        //println(readOnly)
        //println(readOnly.last())
        //println(readOnly.first())

        //filtrar

        //val example = readOnly.filter { it.length > 6 }
        //println(example)

        //val example = readOnly.filter { it.contains("s") }
        //println(example)

        //iterar
        //readOnly.forEach { weekDay -> println(weekDay) }

    }
    }