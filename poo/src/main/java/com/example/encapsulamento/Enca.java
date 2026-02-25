package com.example.encapsulamento;

public class Enca {
    public static void main(String[] args) {
        
        //Encapsulamento: Cliente e Pet
        Cliente cliente = new Cliente();
        Pet pet = new Pet();

        cliente.setNome("João");
        cliente.setIdade(35);
        pet.setNome("Rex");
        pet.setRaca("Pastor Alemão");
        pet.setIdade(5);

        System.out.println("Cliente: " + cliente.getNome() + ", \nIdade: " + cliente.getIdade());
        System.out.println("\nPet: " + pet.getNome() + ", \nRaça: " + pet.getRaca() + ", \nIdade: " + pet.getIdade());

    }
}
