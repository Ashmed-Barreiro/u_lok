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

import Utilidades_LOK.Node
import models.ColorBombeta
import models.lampada
import models.lampada as Lampada
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class MainKtTest {
  @Test
  fun sumar() {
   assertEquals(8, sumar(5, 3))
   assertEquals(2, sumar(1, 1))
   assertEquals(0, sumar(0, 0))
  }

  @Test
  fun esPar() {
   assertTrue(esPar(2))
   assertFalse(esPar(3))
   assertTrue(esPar(4))
   assertTrue(esPar(6))
   assertTrue(esPar(8))
   assertTrue(esPar(10))
  }

  @Test
  fun factorial() {
   assertEquals(120, factorial(5))
   assertEquals(24, factorial(4))
  }

  @Test
  fun invertirCadena() {
   assertEquals("dcba", invertirCadena("abcd"))
   assertEquals("sabmutabor", invertirCadena("robatumbas"))
  }


  @Test
  fun esPalindromo() {
   assertTrue(esPalindromo("solos"))
   assertFalse(esPalindromo("roberto"))
  }

  @Test
  fun maximo() {
   assertEquals(10, maximo(3, 10))
  }

  @Test
  fun menuLampada() {
   val lampada = lampada(false, 1, ColorBombeta.GREEN)
   assertFalse(lampada.encendida)
   assertEquals(1, lampada.intensidad)
   assertEquals(ColorBombeta.GREEN, lampada.color)
   lampada.encendida = true
   assertTrue(lampada.encendida)
  }

  @Test
  fun esPrimo() {
   assertTrue(esPrimo(3))
   assertFalse(esPrimo(6))
   assertFalse(esPrimo(123))
  }

  @Test
  fun contarVocales() {
   assertEquals(4, contarVocales("arrecife"))
   assertEquals(5, contarVocales("abracadabra"))
   assertEquals(0, contarVocales("ldfcbv"))
  }

  @Test
  fun sumarElementos() {
   assertEquals(15, sumarElementos(arrayOf(1, 2, 3, 4, 5)))
   assertEquals(0, sumarElementos(arrayOf()))
   assertEquals(500, sumarElementos(arrayOf(100, 100, 100, 100, 100)))
  }

  @Test
  fun encontrarMaximo() {
   assertEquals(10, encontrarMaximo(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
   assertEquals(
    1415,
    encontrarMaximo(arrayOf(5, 1, 14, 15, 1415, 4, 4, 1, 6, 767, 7, 17, 1316, 16, 66, 164, 64, 63, 243,))
   )
  }

  @Test
  fun testInvertirArray() {
   assertArrayEquals(arrayOf(3, 2, 1), invertirArray(arrayOf(1, 2, 3)))
   assertArrayEquals(arrayOf(10, 20, 30, 40), invertirArray(arrayOf(40, 30, 20, 10)))
   assertArrayEquals(arrayOf<Int>(1, 2, 3, 4, 5, 6, 7), invertirArray(arrayOf(7, 6, 5, 4, 3, 2, 1)))
  }


  @Test
  fun contieneElemento() {
   assertTrue(contieneElemento(arrayOf(1, 23, 5, 132, 64134, 613247, 87, 18, 11, 241), 23))
  }

  @Test
  fun promedioArray() {
   assertEquals(3.0, promedioArray(arrayOf(1.0, 2.0, 3.0, 4.0, 5.0)))
  }

  @Test
  fun sumarMatriz() {
   val matriz = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
   assertEquals(45, sumarMatriz(matriz))
  }

  @Test
  fun transponerMatriz() {
   val matriz = arrayOf(
    arrayOf(1),
    arrayOf(2),
    arrayOf(3)
   )
   val esperada = arrayOf(arrayOf(1, 2, 3))
   assertEquals(esperada.map { it.toList() }, transponerMatriz(matriz).map { it.toList() })
  }


  @Test
  fun esCuadrada() {
  assertTrue(esCuadrada(arrayOf(arrayOf(1,2,5), arrayOf(3,4,4),arrayOf(6,7,8))))
  }

 }
