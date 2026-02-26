package com.example.atv4;

public class Petshop {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Rex", 5, "Hotveiler", "Grande", "Ração");

        Pet pet2 = new Pet("Princesa", 9, "Pitbull", "Médio", "Whiskers");
        System.out.println("Pet 1: " + pet1.getNome() + ",\n " + pet1.getIdade() + ",\n " + pet1.getRaca() + ",\n " + pet1.getPorte() + ",\n " + pet1.getAlimentacao());
        System.out.println("Pet 2: " + pet2.getNome() + ",\n " + pet2.getIdade() + ",\n " + pet2.getRaca() + ",\n " + pet2.getPorte() + ",\n " + pet2.getAlimentacao());
    }
}
