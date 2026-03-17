package com.example.complementar.atv1;

public class Pix implements Pagamento{

    
    
    @Override
    public float processarPagamento(float valor, float valorPix) {
        System.out.println("Cobrando no PIX\nGerando a chave...");

        System.out.println("A chave a ser enviada é:1213132");

        System.out.println("O valor pago foi de:");
        float pago = valor - valorPix;

        System.out.println(pago);
        return pago;
    }

    
}
