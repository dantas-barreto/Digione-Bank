package com.example.digionebank.testes

import com.example.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria Clara", "123.456.789-00", 8000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}