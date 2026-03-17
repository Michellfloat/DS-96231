package com.example.complementar.atv1;

public class CartaoCredito implements Pagamento{
    
    
    
    @Override
    public float processarPagamento(float valor, float valorCartaoCredito) {
        

        System.out.println("Cobrando no cartão\nGerando o código de barras");
        
        System.out.println("O valor pago foi:");

        System.out.println(valor - valorCartaoCredito);    
        return valor - valorCartaoCredito;

    
        
    }
    //terminar amanhã
}
