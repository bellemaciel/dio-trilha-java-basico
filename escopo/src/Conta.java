public class Conta {
    
    double saldo = 10;

    public void sacar(double valor){

         saldo -= valor;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo = "+saldo);
    }
}
