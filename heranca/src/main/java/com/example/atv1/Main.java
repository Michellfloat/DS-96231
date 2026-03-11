package com.example.atv1;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel", "Core i7", "3.6 GHz");
        Memoria memoria = new Memoria("Corsair", "Vengeance LPX", "16 GB");

        System.out.println("Processador:");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frequência: " + processador.getFrequencia());

        System.out.println("\nMemória:");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Capacidade de Armazenamento: " + memoria.getCapacidadeArmazenamento());

        System.out.println("\nDispositivo de Armazenamento:");
        DispositivoArmazenamento dispositivo = new DispositivoArmazenamento("Samsung", "EVO 860", "1 TB", "SATA");
        System.out.println("Marca: " + dispositivo.getMarca());
        System.out.println("Modelo: " + dispositivo.getModelo());
        System.out.println("Capacidade de Armazenamento: " + dispositivo.getCapacidadeArmazenamento());
        System.out.println("Tipo de Conexão: " + dispositivo.getTipoConexao()); 

        System.out.println("\nPlaca de Vídeo:");
        DispositivoArmazenamento placaVideo = new DispositivoArmazenamento("NVIDIA", "GeForce RTX 3080", "10 GB", "PCIe");
        System.out.println("Marca: " + placaVideo.getMarca());
        System.out.println("Modelo: " + placaVideo.getModelo());
        System.out.println("Capacidade de Armazenamento: " + placaVideo.getCapacidadeArmazenamento());
        System.out.println("Tipo de Conexão: " + placaVideo.getTipoConexao());
    }
}
