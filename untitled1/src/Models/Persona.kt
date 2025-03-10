package itb.models

import java.io.Serializable

class Persona : Serializable {
    private var nom: String
    private var mail: String

    constructor(nom: String = "", mail: String = ""){
        this.nom = nom
        this.mail = mail
    }

    fun getNom(): String { return this.nom }
    fun getMail(): String { return this.mail }

    fun setNom(nom: String) {
        this.nom = nom
    }
    fun setMail(mail: String) {
        this.mail = mail
    }

    override fun toString(): String {
        return "Nom: ${this.nom}\nMail: ${this.mail}"
    }
}