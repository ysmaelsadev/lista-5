package atividade5parte2;

public class Contabanco {
    double numeroconta;
    double saldo;
    public void depositar(double valor) {
         saldo+=(valor);

    }
    public void sacar (double tirar){
         saldo-=(tirar);
    
    } public double exibirsaldo(){
        return saldo;
    }
}
