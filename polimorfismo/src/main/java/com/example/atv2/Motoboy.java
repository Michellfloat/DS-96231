package com.example.atv2;

public class Motoboy extends Funcionario{
 private String carteiradeHabilitacao;

 public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario, String carteiradeHabilitacao) {
     super(nome, dataNascimento, sexo, setor, salario);
     this.carteiradeHabilitacao = carteiradeHabilitacao;
 }

 public String getCarteiradeHabilitacao() {
     return carteiradeHabilitacao;
 }

 public void setCarteiradeHabilitacao(String carteiradeHabilitacao) {
     this.carteiradeHabilitacao = carteiradeHabilitacao;
 }

 @Override
 public double salarioFinal() {
    
    return super.salario;
 }

 @Override
 public String toString() {
    return "Motoboy [nome=" + nome + ", carteiradeHabilitacao=" + carteiradeHabilitacao + ", dataNascimento="
            + dataNascimento + ", sexo=" + sexo.getTexto() + ", setor=" + setor.getTexto() + ", salario=" + salario + ", salarioFinal()="
            + salarioFinal() + "]";
 }

 

 
}