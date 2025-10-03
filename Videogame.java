package atividade5parte2;

public class Videogame {
    String nome;
    String modelo;
    String jogosdisponivesis;
   // public Videogame (String nome, String modelo, String jogosdisponivei){
       // this.nome=nome;
      //  this.modelo=modelo;
       // this.jogosdisponivesis=jogosdisponivei;
      //  System.out.println(nome+modelo+jogosdisponivei);
   // }
    
    public void listarjogos(){
        System.out.println(jogosdisponivesis);
    }
    public void adicionarjogo(String jogo){
       jogosdisponivesis+=jogo;
        System.out.println(jogo + "adicionado");
    }
}
