package com.example.complementar.atv1;

public class Boleto implements Pagamento{
  

    @Override
    public float processarPagamento(float valor, float valorBoleto) {

        System.out.println("Cobrando no boleto...");
        System.out.println("Código do boleto:32432443");

        System.out.println("Gerando código de barras...");

        System.out.println("O valor pago foi:");
        float pago = valor - valorBoleto;

        System.out.println(pago);
        return pago;
    }



}
