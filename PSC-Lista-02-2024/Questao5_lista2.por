programa {
  funcao inicio() {
    inteiro pessoasAle, pessoasPort, pessoasIta
    real valorAle, valorPort, valorIta, valorTotal

    escreva ("Quantas pessoas vão para Alemanha? ")
    leia (pessoasAle)
    escreva ("E qual o valor da viagem para Alemnha? ")
    leia (valorAle)

    escreva ("Quantas pessoas vão para Portugal? ")
    leia (pessoasPort)
    escreva ("E qual o valor da viagem para Portugal? ")
    leia (valorPort)

    escreva ("Quantas pessoas vão para Itália? ")
    leia (pessoasIta)
    escreva ("E qual o valor da viagem para Italia? ")
    leia (valorIta)

    valorTotal = (pessoasAle * valorAle) + (pessoasPort * valorPort) + (pessoasIta * valorIta)

    escreva ("O valor total para os 3 destinos é de R$" + valorTotal)
  }
}
