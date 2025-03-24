package Ex02;

public class ContaBancaria {
    String titula;
    double saldo;

    public ContaBancaria(String titula, double saldo){
        this.titula = titula;
        this.saldo = saldo;
    }

     void Depositar(double valor){

        saldo += valor;
         System.out.println("Seu novo saldo é de: R$ "+saldo);
    }

    void Sacar(double valor){
        saldo -= valor;
    }

    void Transferir(double valor, ContaBancaria dest){
        saldo = saldo - valor;
        dest.Depositar(valor);


    }

    void Printar (){

        System.out.println(titula);
        System.out.println(saldo);
    }


}
