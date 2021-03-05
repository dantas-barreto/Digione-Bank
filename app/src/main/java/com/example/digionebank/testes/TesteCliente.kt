package com.example.digionebank.testes

import com.example.digionebank.Cliente
import com.example.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.123.123-12",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}