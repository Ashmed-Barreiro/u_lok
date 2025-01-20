package modalitats
/**
 * Definició de la classe Node per representar cada node de l'arbre
 */
data class alumno(
    var nombre: String,
    var edad: Int,
    var notasCastellano: Double,
    var notasMatematicas: Double) {

    override fun toString(): String {
        val text = "Nom: $nombre\n" + "Edad: $edad.\n" + "Nota de Castellano: $notasCastellano\n" + "Nota de Matematicas: $notasMatematicas\n "
        return text
    }
}   