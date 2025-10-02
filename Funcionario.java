package atividade5parte2;

public class Funcionario {
    String nome;
    double salario;

    public double salarioanual() {
         return salario*12;
    }
    public double  aumentodosalario (double percentual){
       return salario+= salario*(percentual/100);
    }
}
