package atividade5parte2;

public class aluno {
    String nome;
    float nota1;
    double nota2;
    
     

    public double media() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprovado(){
        return media() >=7;

    }
}


