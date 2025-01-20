package Utilidades_LOK

import modalitats.*

fun contarNumeros(numUsuario:Int, contador:Int){
    if (numUsuario>=contador){
        contarNumeros(numUsuario, contador+1)
        println("Tienes $contador numeros")
    }
}

fun suma(num1:Int, num2:Int){
    return println("La suma de $num1 y $num2 es igual a ${num1+num2}")
}

fun suma(num1:Int, num2:Int, num3:Int){
    return println("La suma de $num1, $num2 y $num3 es igual a ${num1+num2+num3}")
}

fun suma(num1:Int, num2:Int, num3:Int, num4:Int){
    return println("La suma de $num1, $num2, $num3 y $num4 es igual a ${num1+num2+num3+num4}")
}

fun mostrarMenu(lista:MutableList<String>) {
    println("Quieres añadir o quitar un elemento de la lista ")
    do {
        println("1:Añadir, 2:Eliminar, 3:Mostrar tabla y salir")
        var opcionUsuario = llegirInt()
        when (opcionUsuario) {
            1 -> {
                println("Que color quieres añadir en la lista?")
                lista.add(llegirStrings())
            }

            2 -> {
                println("Que color quieres eliminar de la lista?")
                println(lista)
                lista.remove(llegirStrings())
            }

            3 -> {
                println("La lista tiene ${lista.size} elementos")
                println(lista)
            }
        }
    }while (opcionUsuario!=3)
}

fun matriu(matriz:Array<Array<Int>>){
    var num = 1
    for (i in matriz[0].indices) {
        for (j in matriz.indices) {
            matriz[j][i] = num++
        }
        for (j in matriz.indices) {
            print("|${matriz[j][i]}|")
        }
        println()
    }
}

fun sumaMatriu(matriz: Array<Array<Int>>) {
    var num = 0
    var suma = 0
    for (i in matriz[0].indices) {
        for (j in matriz.indices) {
            matriz[j][i] = num++
            suma += matriz[j][i]
        }
            for (j in matriz.indices) {
                print("|${matriz[j][i]}|")

            }
        println()
        println("La suma de la matriz es $suma")
            println()
        }
    println("La suma de la matriz es $suma")
    }

fun alumnos():String{
    var julian: alumno = alumno("",0,0.0,0.0)
    println("Como te llamas?")
    julian.nombre=readln()
    println("Cual es tu edad?")
    julian.edad=readln().toInt()
    println("Que nota sacaste en la asignatura de castellano?")
    julian.notasCastellano= readln().toDouble()
    println("Que nota sacaste en la asignatura de matematicas?")
    julian.notasMatematicas = readln().toDouble()
    return julian.toString()
}
