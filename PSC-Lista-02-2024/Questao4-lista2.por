programa {
  funcao inicio() {
    real valorLitro, litrosvendidos, pagamento

    escreva ("Digite o valor do litro da gasolina: ")
    leia (valorLitro)
    escreva ("Quantos litros foram vendidos? ")
    leia (litrosvendidos)

    pagamento = valorLitro * litrosvendidos

    escreva ("O pagamento pelos litros será de: R$" + pagamento)
  }
}
