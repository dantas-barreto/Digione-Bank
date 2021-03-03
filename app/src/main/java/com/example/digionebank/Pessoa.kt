package com.example.digionebank

class Pessoa {
    var nome: String = "João Pedro"
    var cpf: String = "123.456.789-00"
}

fun main() {
    val joaopedro = Pessoa()

    println(joaopedro.nome)
    println(joaopedro.cpf)
}