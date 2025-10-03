package atividade5parte2;

public class Celular {
    private String marca;
    private String modelo;
    private int  niveldebateria;

    public Celular (String marca, String modelo, int niveldebateria) {
        this.marca=marca;
        this.modelo=modelo;
        this.niveldebateria= niveldebateria;
    }

    public void ligar () {
        System.out.println("celular ligou");
    }
    public String enviarmensagem (String mensagem){
        //System.out.println("olá, mundo!");
        return mensagem;
    }
    public void carregar (){
        System.out.println("carregando..."+ niveldebateria + "%");
    }
}
