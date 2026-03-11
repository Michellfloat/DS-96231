package com.example.complementar;

public class Carro extends Veiculo{
    private int quantPortas;

    public Carro(String marca, double velocidade, int quantPortas) {
        super(marca, velocidade);
        this.quantPortas = quantPortas;
    }

    @Override
    public void acelerar(double incremento){
        //Carro acelerará com um bônus de aerodinâmica(exemplo)
        super.acelerar(incremento * 1.2);
    }

    public void abrirPorta_malas(){
        System.out.println("Porta-malas aberto!");
    }

    @Override
    public String toString() {
        return "Carro [quantPortas=" + quantPortas + ", marca=" + marca + ", velocidade=" + velocidade + "]";
    }
    
}
