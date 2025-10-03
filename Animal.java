package atividade5parte2;

public class Animal {
    String nome;
    String especie;
    int idade;

    public  Animal (String nome, String especie, int idade){
        this.nome=nome;
        this.especie= especie;
        this.idade=idade;

        System.out.println("nome: " + nome+", especie: "+ especie +", idade: "+ idade);
    }
    public void emitirsom(){
        System.out.println("AUUUUUUUU, AU");
    }
}
