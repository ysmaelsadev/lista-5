package atividade5;


public class Produto {
    String nome;
    float preço;
    int quantidade;
    float calcularValortotal(){
        float total= quantidade*preço;
        System.out.println(nome+ " com preço de $" +preço +" com quantidade = "+quantidade+ "  da um total de>>  $"+ total);
        return total;
    }
}
