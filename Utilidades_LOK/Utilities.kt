package Utilidades_LOK
import java.util.*

val scan: Scanner = Scanner(System.`in`)

/**
 * This method can be used to read a String word value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readWord(pMessageIn: String
             , pMessageErrorDT: String
): String{

    var outputValue: String = ""
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.next()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a String sentence from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readSentence(pMessageIn: String
             , pMessageErrorDT: String
): String{

    var outputValue: String = ""
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextLine()
        }
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a Char value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readChar(pMessageIn: String
             , pMessageErrorDT: String
): Char{

    var outputValue: Char = ' '
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            // Get the first character of the input word from scan.next()
            outputValue = scan.next()[0]
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a Char value from the user through keyboard using java.util.Scanner. It can force the output Char to be lower or uppercase
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @param pCase Input parameter to force lowercase (0) or uppercase (1)
 * @return outputValue Output value
 */
fun readChar(pMessageIn: String
             , pMessageErrorDT: String
             , pCase: Int
): Char{

    var outputValue: Char = ' '
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = if (pCase == 0) scan.next()[0].lowercaseChar()
            else scan.next()[0].uppercaseChar()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a Boolean value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readBoolean(pMessageIn: String
                , pMessageErrorDT: String
): Boolean{

    var outputValue: Boolean = false
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNextBoolean()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextBoolean()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read an Int value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readInt(pMessageIn: String
            , pMessageErrorDT: String
): Int{

    var outputValue: Int = 0
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNextInt()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextInt()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read an Int value from the user through keyboard using java.util.Scanner in within a range
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @param pMessageErrorDV Data value error message to be shown to the user
 * @param pMin Min accepted value
 * @param pMax Max accepted value
 * @return outputValue Output value
 */
fun readInt(pMessageIn: String
            , pMessageErrorDT: String
            , pMessageErrorDV: String
            , pMin: Int
            , pMax: Int
): Int{

    var outputValue: Int = 0
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNextInt()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextInt()

            if (outputValue < pMin || outputValue > pMax){
                println(YELLOW_BOLD_BRIGHT + "WARNING: " + pMessageErrorDV + RESET)
                correctDataType = false
            }
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a Float value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @return outputValue Output value
 */
fun readFloat(pMessageIn: String
              , pMessageErrorDT: String
): Float{

    var outputValue: Float = 0.0f
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNextFloat()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextFloat()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a Float value from the user through keyboard using java.util.Scanner in within a range
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @param pMessageErrorDV Data value error message to be shown to the user
 * @param pMin Min accepted value
 * @param pMax Max accepted value
 * @return outputValue Output value
 */
fun readFloat(pMessageIn: String
            , pMessageErrorDT: String
            , pMessageErrorDV: String
            , pMin: Float
            , pMax: Float
): Float{

    var outputValue: Float = 0.0f
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNextFloat()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextFloat()

            if (outputValue < pMin || outputValue > pMax){
                println(YELLOW_BOLD_BRIGHT + "WARNING: " + pMessageErrorDV + RESET)
                correctDataType = false
            }
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}
/** Esta función devuelve algún olor aleatoriamente
 * */
fun coloresAleatorios():String{
    val colores = arrayOf(
        RESET,
        BLACK,
        RED,
        GREEN,
        YELLOW,
        BLUE,
        PURPLE,
        CYAN,
        WHITE,
        BLACK_BOLD,
        RED_BOLD,
        GREEN_BOLD,
        YELLOW_BOLD,
        BLUE_BOLD,
        PURPLE_BOLD,
        CYAN_BOLD,
        WHITE_BOLD,
        BLACK_UNDERLINED,
        RED_UNDERLINED,
        GREEN_UNDERLINED,
        YELLOW_UNDERLINED,
        BLUE_UNDERLINED,
        PURPLE_UNDERLINED,
        CYAN_UNDERLINED,
        WHITE_UNDERLINED,
        BLACK_BRIGHT,
        RED_BRIGHT,
        GREEN_BRIGHT,
        YELLOW_BRIGHT,
        BLUE_BRIGHT,
        PURPLE_BRIGHT,
        CYAN_BRIGHT,
        WHITE_BRIGHT,
        BLACK_BOLD_BRIGHT,
        RED_BOLD_BRIGHT,
        GREEN_BOLD_BRIGHT,
        YELLOW_BOLD_BRIGHT,
        BLUE_BOLD_BRIGHT,
        PURPLE_BOLD_BRIGHT,
        CYAN_BOLD_BRIGHT,
        WHITE_BOLD_BRIGHT,
    )
    var colorAleatorio = colores.random()
    return colorAleatorio.toString()
}
/**
 * Funcion que busca coincidencias de un array a la hora de recorrerlo para escoger la opcion que tu quieres. Se ha de personalizar en cada codigo.
 * @author Martí Vilàs
 */

fun buscarCoincidencias(): String {
    val modelo = listOf(
        "California Beach Tour",
        "California Beach",
        "California Beach Camper",
        "California Ocean"
    )

    var seguro: Boolean
    var eleccion: Int
    do {
        seguro = false

        val user = readSentence("Dime qué furgo quieres:", "Debe ser una de las furgos que tenemos")

        val coincidencias = mutableListOf<String>()
        for (furgo in modelo) {
            if (furgo.contains(user, ignoreCase = true)) { // Comparación insensible a mayúsculas
                coincidencias.add(furgo)
            }
        }

        if (coincidencias.isEmpty()) {
            println("No se encontró ninguna furgoneta con ese nombre. Inténtalo de nuevo.")
        } else if (coincidencias.size == 1) {

            val seleccion = coincidencias[0]
            println("Has seleccionado la furgoneta: $seleccion")

            seguro = confirmacionFinal(seleccion)

            if (seguro) return seleccion
        } else {
            println("Se encontraron varias coincidencias:")
            for (i in coincidencias.indices) {
                println("${i + 1}. ${coincidencias[i]}")
            }

            do {
                println("Elige el número de la opción que deseas (1-${coincidencias.size}):")
                eleccion = readInt("","")
                if (eleccion in 1..coincidencias.size) {
                    val seleccion = coincidencias[eleccion - 1]
                    println("Has seleccionado la furgoneta: $seleccion")
                    seguro = confirmacionFinal(seleccion)
                    if (seguro) return seleccion
                } else {
                    println("Por favor, introduce un número válido entre 1 y ${coincidencias.size}.")
                }
            } while (!seguro)
        }
    } while (!seguro)
    return ""
}

/**
 * Funcion que sirve para confirmar que el ususario quiere realmente usar la opcion seleccionada
 */
fun confirmacionFinal(opcion: String): Boolean {
    println("¿Quieres la $opcion? (s/n):")
    return readYesOrNou("Debe ser una de las opciones (s/n):")
}

/**
 * función que lee "S" o "n" como boolean para saber si el usuario quiere aceptar algo o no
 * @since 18/12/2024
 * @author Ashmed Barreiro*/
fun readYesOrNou(message: String): Boolean {
    var answer: String = ""
    do {
        answer = readWord(message,"Debe ser una de las opciones (s/n):")
    }while(!(answer.equals("s", ignoreCase = true) || answer.equals("n", ignoreCase = true)))
    return answer.equals("s", ignoreCase = true)
}
/**
 * Funció entry point per a l'execució dels mètodes que calculen el factorial
 * @author dmarin-itb
 */
fun main() {
    // Creació de dos arbres amb nodes
    val arbre1 = Node(
        1, listOf(
            Node(2, listOf(Node(4), Node(5))),
            Node(3, listOf(Node(6), Node(7)))
        )
    )
    val arbre2 = Node(
        1, listOf(
            Node(2, listOf(Node(4), Node(5), Node(10))),
            Node(3, listOf(Node(6), Node(7))),
            Node(11)
        )
    )
    println("Arbre 1:")
    recorrerArbre(arbre1)

    println("\nArbre 2:")
    recorrerArbre(arbre2)

    val arbreAplanat1 = aplanarArbre(arbre1)
    println("\nArbre 1 aplanat:")
    println(arbreAplanat1)

    val arbreAplanat2 = aplanarArbre(arbre2)
    println("\nArbre 2 aplanat:")
    println(arbreAplanat2)

}

/**
 * Funció recursiva per recórrer l'arbre i imprimir els valors dels nodes recorrent en profunditat primer (DFS, Depth-First Search)
 * @author dmarin-itb
 * @param node Element de tipus Node que actúa com a arrel (primer nivell) de l'arbre a recòrrer
 */
fun recorrerArbre(node: Node) {
    // Imprimeix el valor del node actual
    println(node.valor)

    // Recórrer cada fill del node actual
    for (fill in node.fills) {
        recorrerArbre(fill) // crida recursiva per recórrer els fills
    }
}

/**
 * Funció recursiva per aplanar l'arbre i retornar una llista amb els valors dels nodes recorrent en profunditat primer (DFS, Depth-First Search)
 * @author dmarin-itb
 * @param node Element de tipus Node que actua com a arrel de l'arbre
 * @return Llista amb els valors de tots els nodes de l'arbre
 */
fun aplanarArbre(node: Node): List<Int> {
    // Comença amb el valor del node actual
    val llistaArbre = mutableListOf(node.valor)

    // Per cada fill, crida recursivament a la funció i afegeix els valors a la llista
    for (fill in node.fills) {
        llistaArbre.addAll(aplanarArbre(fill))
    }

    return llistaArbre
}
