package com.example.myapplication.sintaxis

fun main() {
    //getMonth(8)
    getTrimester(4)
    //result("holacomoestas")
}

fun result(value: Any) {
    when (value) {
        is Int -> value + value;
        is String -> println(value);
        is Boolean -> if (value) println("hola");
    }
}

fun getTrimester(month: Int) = when (month) {
    in 1..3 -> "Primer trimestre"
    in 4..6 -> "Segundo trimestre"
    in 7..9 -> "Tercer trimestre"
    in 10..12 -> "Cuarto trimestre"
    !in 1..12 -> "Mes no valido"
    //else -> println("Mes no valido") // o puede ser !in 1..12 -> println("Mes no valido")
    else -> "lo que sea"
}


fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> { //ejemplo de que se puede meter mas codigo entre llaves
            println("Agosto")
            println("Es mi mes favorito") // ejemplo de codigo extra con llaves
        }

        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("Mes no valido")
    }
}
