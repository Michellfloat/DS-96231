package com.example.atv5;

public class CantoDaLivraria {
 public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-0261102385", 1216, 49.90);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "978-0545582889", 309, 29.90);

        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Número de Páginas: " + livro1.getNumeroDePaginas());
        System.out.println("Valor da Venda: R$" + livro1.getValorDaVenda());

        System.out.println("\nLivro 2:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("ISBN: " + livro2.getIsbn());
        System.out.println("Número de Páginas: " + livro2.getNumeroDePaginas());
        System.out.println("Valor da Venda: R$" + livro2.getValorDaVenda());

        Veiculo veiculo1 = new Veiculo("345F21", "Preto", 4, 50.0, 180.0, 12.0);
        Veiculo veiculo2 = new Veiculo("678G34", "Vermelho", 2, 30.0, 120.0, 8.0);

        System.out.println("\nVeículo 1:");
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Cor: " + veiculo1.getCor());
        System.out.println("Número de Passageiros: " + veiculo1.getNumeroDePassageiros());
        System.out.println("Capacidade do Tanque: " + veiculo1.getCapacidadeDoTanque() + " litros");
        System.out.println("Velocidade Máxima: " + veiculo1.getVelocidadeMaxima() + " km/h");
        System.out.println("Consumo de Combustível: " + veiculo1.getConsumoDeCombustivel() + " km/l");
        
        System.out.println("\nVeículo 2:");
        System.out.println("Placa: " + veiculo2.getPlaca());
        System.out.println("Cor: " + veiculo2.getCor());
        System.out.println("Número de Passageiros: " + veiculo2.getNumeroDePassageiros());
        System.out.println("Capacidade do Tanque: " + veiculo2.getCapacidadeDoTanque() + " litros");
        System.out.println("Velocidade Máxima: " + veiculo2.getVelocidadeMaxima() + " km/h");
        System.out.println("Consumo de Combustível: " + veiculo2.getConsumoDeCombustivel() + " km/l");

        Cliente cliente1 = new Cliente("Mário", 35, "123456789-00", "Rua das Flores, 123", "12345-6789");
        Cliente cliente2 = new Cliente("Ana", 28, "987654321-00", "Avenida Central, 456", "98765-4321");
        Cliente cliente3 = new Cliente("Mirai", 17, "111222333-44", "Rua dos Sonhos, 789", "11122-3334");

        System.out.println("\nBem vindo, " + cliente1.getNome() + "! \nVocê comprou o livro " + livro1.getTitulo() + " por R$" + livro1.getValorDaVenda() + " e possui o veículo com placa " + veiculo1.getPlaca() + " \nque gasta R$" + veiculo1.getConsumoDeCombustivel() * 10 + " para abastecer o tanque.");
        System.out.println("\nBem vindo, " + cliente2.getNome() + "! \nVocê comprou o livro " + livro2.getTitulo() + " por R$" + livro2.getValorDaVenda() + " e possui o veículo com placa " + veiculo2.getPlaca() + " \nque gasta R$" + veiculo2.getConsumoDeCombustivel() * 10 + " para abastecer o tanque.");
        System.out.println("\nBem vindo, " + cliente3.getNome() + "! \nVocê comprou o livro " + livro1.getTitulo() + " por R$" + livro1.getValorDaVenda() + " e possui o veículo com placa " + veiculo1.getPlaca() + " \nque gasta R$" + veiculo1.getConsumoDeCombustivel() * 10 + " para abastecer o tanque.");
 }
}
