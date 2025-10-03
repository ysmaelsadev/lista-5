package atividade5parte2;

public class Musica {
  
    private String titulo;
    private String artista;
    private double duracao; 

    
    public Musica(String titulo, String artista, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    
    public void tocar() {
        System.out.println("Tocando \"" + titulo + "\" de " + artista + "...");
    }

    
    public void exibirresumo() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao + " min");
    }
}


