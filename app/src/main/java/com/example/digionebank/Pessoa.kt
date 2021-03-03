package com.example.digionebank

class Pessoa {
    var nome: String = "João Pedro"
    var cpf: String = "123.456.789-00"
    private set

    inner class Endereco {
        var rua: String = "Rua teste"
    }

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val joaopedro = Pessoa()

    println(joaopedro)
    println(joaopedro.pessoaInfo())
}