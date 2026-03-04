package com.example.otimizacao.teste;

public class Interruptor {
    private EstadoLuz estado = EstadoLuz.DESLIGADO;

    public void alternar() {
        // Lógica encapsulada: o mundo externo não muda o estado, o método decide.
        estado = (estado == EstadoLuz.DESLIGADO) ? EstadoLuz.LIGADO : EstadoLuz.DESLIGADO;
    }

    @Override
    public String toString() { return "A luz está: " + estado; }
}
