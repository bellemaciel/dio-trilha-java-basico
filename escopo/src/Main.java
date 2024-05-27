public class Main {
    
    public static void main(String[] args){

        Conta conta = new Conta();

        conta.imprimirSaldo();
        conta.sacar(5);
        conta.imprimirSaldo();
    }
}
