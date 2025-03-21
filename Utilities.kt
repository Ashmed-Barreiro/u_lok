package u_lok
import java.io.*
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
 * Document kt dedicat al emmagatzematge de funcions de lectura de Int, Double, Float, Long, Word, Char per poder usar
 * en les funcions dels projectes.
 * @author Raimon Izard, David Marin i Martí Vilàs.
 */
fun llegirInt(): Int{
    val scanner=Scanner(System.`in`)
    var num:Int=0
    var error = true
    do {if (scanner.hasNextInt()){
        num=scanner.nextInt()
        error=false
    }else {
        scanner.nextLine()
        println("${RED}ERROR HA DE SER UN NÚMERO ENTER${RESET}")
    }
    }while (error)
    return num
}

fun llegirDouble(pMessageIn: String
                 , pMessageErrorDT: String
):Double {
    val scanner=Scanner(System.`in`)
    var num:Double=0.0
    var error = true
    do {if (scanner.hasNextDouble()){
        num=scanner.nextDouble()
        error=false
    }else {
        scanner.nextLine()
    }
    }while (error)
    return num
}

/**
 * This method can be used to read an Int value from the user through keyboard using java.util.Scanner
 * @author argar.crespo
 * @since 11/12/2024
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun llegirFloat( pMessageIn: String, pMessageErrorDT: String):Float {
    var outputValue: Float = 0.0f
    var correctDataType: Boolean = false

    do{
        println(PURPLE_BOLD + pMessageIn + RESET)
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

fun llegirLong():Long {
    val scanner=Scanner(System.`in`)
    var num:Long=0
    var error = true
    do {if (scanner.hasNextLong()){
        num=scanner.nextLong()
        error=false
    }else {
        scanner.nextLine()
    }
    }while (error)
    return num
}

fun llegirWord(pMessageIn: String, pMessageErrorDT: String): String {
    val scanner=Scanner(System.`in`)
    val outputValue: String
    do {
        println(pMessageIn)
        if (!scanner.hasNext()) {
            println("ERROR: $pMessageErrorDT")
            scanner.next()
        } else {
            outputValue = scanner.next()
            scanner.nextLine()
            return outputValue
        }
    } while (true)
}

fun llegirChar( pCase: Int = -1): Char {
    val scanner=Scanner(System.`in`)
    val outputValue: Char
    do {
        if (!scanner.hasNext()) {
            scanner.next()
        } else {
            outputValue = scanner.next()[0]
            scanner.nextLine() // clear buffer
            when (pCase) {
                0 -> return outputValue.lowercaseChar()
                1 -> return outputValue.uppercaseChar()
                else -> return outputValue
            }
        }
    } while (true)
}

fun llegirStrings(): String{
    val scanner=Scanner(System.`in`)

    var outputValue: String = ""
    var correctDataType: Boolean = false

    do{
        correctDataType = scanner.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + RESET)
        }else{
            outputValue = scanner.nextLine()
        }
    }while(!correctDataType)

    return outputValue
}


fun llegirSioNo() : Boolean {
    var scanner=Scanner(System.`in`)
    val resposta=scanner.nextLine().lowercase()

    return when (resposta) {
        "si" -> true
        "s" -> true
        "no" -> false
        "n" -> false
        else -> {
            println("Resposta no vàlida la resposta ha de ser Si o No")
            llegirSioNo()
        }
    }
}

fun llegirEntre1o2(): Int {
    val scanner = Scanner(System.`in`)
    var numero: Int = 0
    var error = true

    do {
        if (scanner.hasNextInt()) {
            numero = scanner.nextInt()
            if (numero in 1..2) {
                error = false
            } else {
                println("Per favor, ingressa un valor vàlid (1 o 2).")
            }
        } else {
            println("Per favor, ingressa un número enter.")
            scanner.nextLine()
        }
    } while (error)
    return numero
}

/**
 * This method can be used to read an Int value from the user through keyboard using java.util.Scanner
 * @author argar.crespo
 * @since 11/12/2024
 * @return outputValue Output value
 */

fun llegirTotsInt(): Int{

    var valorDeSalida: Int = 0
    var correcto: Boolean = false

    do{
        correcto = scan.hasNextInt()

        if (!correcto){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + RESET)
        }else{
            valorDeSalida = scan.nextInt()
        }
        scan.nextLine()
    }while(!correcto)

    return valorDeSalida
}
/*Función para importar datos de un fichero, en este caso son objetos pero 
se puede cambiar, solo necesita la ruta para saber de donde lo pilla*/

fun importarAny(ruta: String): MutableList<Any> {
    val ficheros = File(ruta)
    val fis = FileInputStream(ficheros)
    val ois = ObjectInputStream(fis)
    val llistaAny: MutableList<Any> = ois.readObject() as MutableList<Any>
    return llistaAny    
}
/*Función para exportar datos de un fichero, en este caso son objetos pero 
se puede cambiar, solo necesita la ruta para saber donde lo mete y los datos a introducir
(En este caso es una mutablelist de un objeto pero se puede cambiar)*/
fun exportarAny(ruta: String, llistaAny: MutableList<Any>) {
   val ficheros = File(ruta)
    val fos = FileOutputStream(ficheros)
    val oos = ObjectOutputStream(fos)
    oos.writeObject(llistaAny)
    oos.close()
}

package controllers

/**
 * Funció per comprovar que un text rebut conté només letres minúscules
 * @author RIS
 * @param text rebut
 * @return True si el text rebut conté només lletres en minúscules, false en cas contrari
 */
fun regexLletres(text: String): Boolean{
    var validacioText: Boolean = false
    val regex: Regex = Regex("[a-z]+")  // Només lletres minúscules

    validacioText = text.matches(regex)
    return validacioText
}

/**
 * Comprovar que el text rebut conté exactament res dígits ni més ni menys
 * @author RIS
 * @param text rebut per validar
 * @return Retorna true si el text rebut conté exactament només tres dígits numèrics; false en cas contrari
 */
fun conteTresDigits(text: String): Boolean{
    var validacioText: Boolean = false
    val regex: Regex = "[0-9]{3}".toRegex()  // El text rebut conté exactament tres dígits numèrics ni més ni menys

    validacioText = text.matches(regex)

    return validacioText
}

/**
 * Comprovar que un text rebut per paràmetre conté almenys un dígit numèric
 * @author RIS
 * @param text rebut
 * @return Retorna true si troba algun dígit enter i false en cas contrari
 */
fun conteDigits(text: String): Boolean{
    var validacioText: Boolean = false
    validacioText = text.contains("\\d+".toRegex()) // Busca números sense importar quants -> d en Regex es refereix a dígits numèrics.

    return validacioText
}

/**
 * Funció que rep dos paràmetres de tipus String i permet validar el text inicial segons el patró regex rebut.
 * Exemple: text = 123, patró = [0-9]{3}, retorn = true
 * @author RIS
 * @param text rebut per validar
 * @param patro per usar com a regex
 * @return Retorna true si el text rebut conté el patró a buscar; false en cas contrari
 */
fun regexParametritzada(text: String, patro: String): Boolean{
    var validacioText: Boolean = false
    var regex: Regex = Regex(patro)
    validacioText = text.matches(regex)
    return validacioText
}

/**
 * Funció per extreure els números d'un text rebut
 * @author RIS
 * @para text rebut per paràmetre
 * @return String
 */
fun extreureDigits(text: String): String{
    val digitsText: Sequence<MatchResult> = "\\d+".toRegex().findAll(text)
    return digitsText.toString()
}

/**
 * Retorna true si l'email compleix amb el patró
 * @author RIS
 * @param email rebut
 * @return Boolean
 */
fun validarEmail(email: String): Boolean{
    var emailCorrecte: Boolean = false
    // Definim l'expressió regular Regex que ens permet validar un email per saber si té format correcte
    val emailRegex: Regex = Regex("^[a-zA-Z0-9.]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")

    emailCorrecte = email.matches(emailRegex)
    return emailCorrecte
}

/**
 * A partir d'un text i un caràcter rebuts per paràmetre, partim el text pel caràcter
 * @author RIS
 * @param text inicial rebut
 * @param c caràcter pel qual partir el text
 * @return List<String>
 */
fun partirTextPerCaracter(text: String, c: Char): List<String>{
    val parts: List<String> = text.split("[$c]".toRegex()) // Usem com a separador el caràcter c rebut
    return parts // Retornem una llista de Strings amb els trossos
}

/**
 * Substitueix números pel contingut del paràmetre rebut c
 * @author RIS
 * @param text Text inicial
 * @param c Caràcter a posar
 * @return String
 */
fun substituirDigitsPerCaracter(text: String, c: Char): String{
    val textSubstituit: String = text.replace("\\d".toRegex(), "$c")
    return textSubstituit
}

fun esPalindromo(frase:String){
    //Selecciona lo que no esté en el conjunto de caracteres, es decir, cualquier cosa que no sea una letra o un número
    //El accento frances hace que no selecione de la A mayúscula a la Z mayúscula, de la a minúscula la z minúscula y del 0 al 9
    if (frase.replace("[^A-Za-z0-9]".toRegex(), "").lowercase() ==
        frase.replace("[^A-Za-z0-9]".toRegex(), "").lowercase().reversed()) {
        println("Correcto")
    } else{
        println("Incorrecto")
    }
}

fun contarCaracteres(frase:String, caracter:Char){
    val contador = frase.count() {it == caracter}
    println("La frase contiene $contador veces el caracter $caracter")
}

 fun contarPalabras (frase:String, palabra:String){
    val contador = frase.replace("[^A-Za-z0-9]".toRegex(), " ").split("\\s+".toRegex()).count { it == palabra }
    println("La frase contiene $contador veces la palabra $palabra")
}

fun comprobarNif(nif: Int): Boolean {
    var validacioText: Boolean = false
    val regex: Regex = "[0-9]{8}".toRegex()

    validacioText = nif.toString().matches(regex)

    return validacioText
}

fun comprobarContraseña(contraseña:String):Boolean{
    var validacioText: Boolean = false
    val regex: Regex = "[0-9]{1}+@+.+,[A-Z]{1,6}+-+_+·+%+&+ª+>".toRegex()

    validacioText = contraseña.matches(regex)

    return validacioText
}

fun comprobarCorreo(listaCorreos:MutableList<String>){
    var validacioText: Boolean = false
    val regex: Regex = "[A-Z]{1}[a-z]{2,6}+@[a-z]{3,5}+.[a-z]{3,5}".toRegex()
    println("Escribe un correo para validar")
    val correo:String = llegirStrings()
    validacioText = correo.matches(regex)
    if (!validacioText){
        println("El correo no es valido")
    }else if (listaCorreos.contains(correo)){
        println("El correo ya esta registrado")
    }else {
        listaCorreos.add(correo)
        println("El correo ha sido registrado")
    }
}
