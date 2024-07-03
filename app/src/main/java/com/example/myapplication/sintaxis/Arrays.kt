package com.example.myapplication.sintaxis

// los arreglos en kotlin son inmutables por defecto, son secuenciales y pueden contener cualquier tipo de dato

fun main() {

    var weekDays= arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
    /*println(weekDays[6]); //0 es el lunes.. 6 es el domingo
    println(weekDays.size);

    weekDays[6] = "Funday"; //se puede modificar el valor de un elemento y asignarle lo que queramos
    println(weekDays[6]); //imprime Funday

    if(weekDays.size >= 8){
        println(weekDays[7])
    }else{
        println("No existe el día 8")
    }*/

    //bucles para recorrer un array
    for(day in weekDays){
        //println(day)
    }

    for (position in weekDays.indices){
        //println("Position $position: ${weekDays[position]}")
    }

    for (position in weekDays.indices) {
        //println(weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()){
        //println("Position $position: $value")
    }

    for(day in weekDays){
        println("AHORA ES $day")
    }

}


