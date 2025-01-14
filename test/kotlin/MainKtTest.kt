import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    // Declaració dels arbres que farem servir per als tests
    val arbreTest1 = Node(
        1, listOf(
            Node(2, listOf(Node(3), Node(4))),
            Node(5, listOf(Node(6), Node(7)))
        )
    )// Aquest arbre aplanat hauria de ser: 1, 2, 3, 4, 5, 6, 7
    val arbreTest2 = Node(
        1, listOf(
            Node(2, listOf(Node(4), Node(5), Node(10))),
            Node(3, listOf(Node(6), Node(7))),
            Node(11)
        )
    )// Aquest arbre aplanat hauria de ser: 1, 2, 4, 5, 10, 3, 6, 7, 11

    /**
     * Comprovem el valor que retorna la funció aplanarArbre, que és una llista dels elements endreçats en un recorregut en profunditat primer (DFS, Depth-First Search)
     */
    @Test
    fun aplanarArbre() {
        val arbreEsperat1 = listOf(1, 2, 3, 4, 5, 6, 7)
        assertArrayEquals(arbreEsperat1.toIntArray(), aplanarArbre(arbreTest1).toIntArray())//l'assertArrayEquals no accepta llistes, però podem passar el resultat a un IntArray, que és acceptat

        val arbreEsperat2 = listOf(1, 2, 4, 5, 10, 3, 6, 7, 11)
        assertArrayEquals(arbreEsperat2.toIntArray(), aplanarArbre(arbreTest2).toIntArray())//l'assertArrayEquals no accepta llistes, però podem passar el resultat a un IntArray, que és acceptat
    }

}
