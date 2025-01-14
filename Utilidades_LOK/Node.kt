/**
 * Definició de la classe Node per representar cada node de l'arbre
 */
data class Node(
    val valor: Int,
    val fills: List<Node> = listOf()
)