programa {
  funcao inicio() {
    inteiro pessoasAle, pessoasPort, pessoasIta
    real valorAle, valorPort, valorIta, valorTotal

    escreva ("Quantas pessoas v�o para Alemanha? ")
    leia (pessoasAle)
    escreva ("E qual o valor da viagem para Alemnha? ")
    leia (valorAle)

    escreva ("Quantas pessoas v�o para Portugal? ")
    leia (pessoasPort)
    escreva ("E qual o valor da viagem para Portugal? ")
    leia (valorPort)

    escreva ("Quantas pessoas v�o para It�lia? ")
    leia (pessoasIta)
    escreva ("E qual o valor da viagem para Italia? ")
    leia (valorIta)

    valorTotal = (pessoasAle * valorAle) + (pessoasPort * valorPort) + (pessoasIta * valorIta)

    escreva ("O valor total para os 3 destinos � de R$" + valorTotal)
  }
}
