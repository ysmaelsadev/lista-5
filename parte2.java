 package atividade5parte2;

 public class parte2 {
    public static void main(String[] args) {
       // aluno aluno1 = new aluno();
       // aluno1.nome="ysmael";
       // aluno1.nota1= 10;
       /// aluno1.nota2= 6.3;
          // System.out.println("Nome: " + aluno1.nome);

       // System.out.println("Média: " + aluno1.media());
       // System.out.println(aluno1.aprovado());

        //retangulo retangulo1= new retangulo();
       // retangulo1.largura= 80;
       // retangulo1.comprimento=100;
        //System.out.println(" A area é de >>" +retangulo1.area()+" m2");
       // System.out.println("o perimetro é de " +retangulo1.perimetro());

        Funcionario f1 = new Funcionario();
        f1.nome= "ysmael";
        f1.salario= 2000;
        System.out.println(f1.salarioanual());
        System.out.println(f1.nome);
        System.out.println("antes o salário era  "+ f1.salario+ ",  agora é  " + f1.aumentodosalario(10));
    }
    }
    
