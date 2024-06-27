package com.example.myapplication

fun main() {
    //getMonth(8)
    getTrimester(10)
}

fun getTrimester(month: Int) {
    when (month) {
        in 1..3 -> println("Primer trimestre")
        in 4..6 -> println("Segundo trimestre")
        in 7..9 -> println("Tercer trimestre")
        in 10..12 -> println("Cuarto trimestre")
        else -> println("Mes no valido")
    }
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
