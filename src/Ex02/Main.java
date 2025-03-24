package Ex02;

public class Main {
    public static void main(String [] args){

    ContaBancaria c1 = new ContaBancaria("Eduardo", 00);
    ContaBancaria c2 = new ContaBancaria("Lidiane", 00);

    c1.Printar();

    c1.Depositar(200);
    c2.Depositar(50);

    c1.Printar();

    c1.Transferir(100,c2);

    c1.Printar();
    c2.Printar();
    }
}
