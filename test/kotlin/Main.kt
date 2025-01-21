import Utilidades_LOK.CYAN_BOLD
import Utilidades_LOK.RED_BOLD
import Utilidades_LOK.RESET
import Utilidades_LOK.llegirStrings
import models.ColorBombeta
import models.lampada

fun main(){
 println(transponerMatriz(arrayOf(arrayOf(1, 2), arrayOf(3, 4))))
}
fun sumar(a: Int, b: Int): Int {
    return a + b
}
fun esPar(numero: Int): Boolean {
    return numero % 2 == 0
}
fun factorial(n: Int): Int {
    require(n >= 0) { "El número debe ser no negativo" }
    return if (n == 0) 1 else (1..n).reduce { acc, i -> acc * i }
}
fun invertirCadena(cadena: String): String {
    return cadena.reversed()
}
fun esPalindromo(palabra: String): Boolean {
    val palabraLimpia = palabra.lowercase().replace(" ", "")
    return palabraLimpia == palabraLimpia.reversed()
}

fun maximo(a: Int, b: Int): Int {
    return if (a > b) a else b
}


fun menuLampada() {
    var lampada: lampada
    lampada = lampada(false, 1, ColorBombeta.GREEN)
    var MENU = """
      $CYAN_BOLD          *********** MENU ************
                         Aquí va esto
                *****************************
                TURN ON 
                TURN OFF
                CHANGE COLOR
                INTENSITY
                END
                ***************************** $RESET
            """.trimIndent()
    do {
        println(MENU)
        var opcionUsuario: String = llegirStrings("Escribe la opcion que desas seleccionar:", "Error dato incorrecto")

        when (opcionUsuario) {
            "TURN ON" -> {
                if (lampada.encendida == true) {
                    println("La lámpara ya está encendida melón!!")
                } else {
                    lampada.encendida = true
                    println(lampada)
                }
            }

            "TURN OFF" -> {
                if (lampada.encendida == false) {
                    println("La lámpara ya está apagada")
                } else {
                    lampada.encendida = false
                    lampada.intensidad = 1
                    println("APAGANDO")
                }
            }

            "CHANGE COLOR" -> {
                lampada.cambiarColor()
                if (lampada.encendida == false) {
                    println("Enciende antes la lámpara para cambiarle el color")
                } else{
                    println(lampada)
                }
            }

            "INTENSITY" -> {
                if (lampada.encendida == false) {
                    println("Enciende antes la lámpara para subirle la intensidad")
                } else {
                    lampada.intensidad++
                    println(lampada)

                }
            }
            "END" -> {
                println("Gracias por usar la aplicacion de la Lámpara Robot AI")
            }

            else -> {
                println("$RED_BOLD Error dato incorrecto $RESET")
            }

        }
    } while (opcionUsuario != "END")
}

fun esPrimo(numero: Int): Boolean {
    // Devuelve true si el número es primo, false en caso contrario
    if (numero < 2) return false
    for (i in 2 until numero) {
        if (numero % i == 0) return false
    }
    return true
}

fun contarVocales(texto: String): Int {
    // Cuenta el número de vocales en un texto
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    return texto.lowercase().count { it in vocales }
}

fun sumarElementos(array: Array<Int>): Int {
    // Devuelve la suma de todos los elementos en el array
    return array.sum()
}

fun encontrarMaximo(array: Array<Int>): Int {
    // Encuentra el valor máximo en el array
    return array.maxOrNull() ?: throw IllegalArgumentException("El array está vacío")
}

fun invertirArray(array: Array<Int>): Array<Int> {
    // Invierte el array
    return array.reversedArray()
}

fun contieneElemento(array: Array<Int>, elemento: Int): Boolean {

    return elemento in array
}

fun promedioArray(array: Array<Double>): Double {
    // Calcula el promedio de los elementos en el array
    if (array.isEmpty()) throw IllegalArgumentException("El array está vacío")
    return array.average()
}

fun sumarMatriz(matriz: Array<Array<Int>>): Int {
    // Devuelve la suma de todos los elementos en la matriz
    return matriz.flatten().sum()
}

fun transponerMatriz(matriz: Array<Array<Int>>): Array<Array<Int>> {
    // Devuelve la matriz transpuesta
    val filas = matriz.size
    val columnas = matriz[0].size
    val transpuesta = Array(columnas) { Array(filas) { 0 } }

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            transpuesta[j][i] = matriz[i][j]
            println("transpuesta[$j][$i] = ${transpuesta[j][i]}")
        }
    }
    return transpuesta
}

fun esCuadrada(matriz: Array<Array<Int>>): Boolean {
    // Comprueba si la matriz es cuadrada
    return matriz.isNotEmpty() && matriz.all { it.size == matriz.size }
}
