package com.example.revisao.atv2;

public class Main {
    public static void main(String[] args) {
        
        //instanciando a classe Pet
        Pet pet1 = new Pet("Docinho",3,"Poodle");
        Pet pet2 = new Pet("Rex",5,"Pastor Alemão");
        //instanciando a classe Cliente
        Cliente cliente1 = new Cliente("Ana",30,pet2);
        Cliente cliente2 = new  Cliente("Carlos Nascimento", 25, pet1);
        Cliente cliente3 = new Cliente("Maria", 40, 
            new Pet("Luna", 2, "Siamês"));//nova instância de Pet dentro do construtor de Cliente

        System.out.println("Cliente: "+cliente1.getNome());
        System.out.println("Seu pet:"+cliente1.getPet().getNome()+"\né da raça:"+cliente1.getPet().getRaca()+"\ne tem "+cliente1.getPet().getIdade()+" anos");
        System.out.println("Cliente: "+cliente2.getNome());
        System.out.println("Seu pet:"+cliente2.getPet().getNome()+"\né da raça:"+cliente2.getPet().getRaca()+"\ne tem "+cliente2.getPet().getIdade()+" anos");

        System.out.println("Cliente: "+cliente3.getNome());
        System.out.println("Seu pet:"+cliente3.getPet().getNome()+"\né da raça:"+cliente3.getPet().getRaca()+"\ne tem "+cliente3.getPet().getIdade()+" anos");

        System.out.println();
    }
}
