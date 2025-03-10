package itb.controllers


import itb.models.Persona
import u_lok.exportarAny
import u_lok.importarAny
import java.io.*

fun afegirPersona(fitxer: String, persona: Persona) {
    val persones = llegirPersones(fitxer).toMutableList()
    persones.add(persona)

    exportarAny(fitxer, persones as MutableList<Any>)

    println("Persona afegida correctament.")
}

fun llegirPersones(fitxer: String): List<Persona> {
    val file = File(fitxer)
    if (!file.exists() || file.length() == 0L) return emptyList()

    importarAny(fitxer).let {
        return it as List<Persona>
    }
    }
