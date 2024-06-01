import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        double saldo = 30.0;
        System.out.println("Digite valor do saque: ");
        double saque = scan.nextDouble();

        if(saldo > saque){
            saldo -= saque;
            System.out.println("Saldo atualizado: "+saldo);
        }else{
         System.out.println("Saldo insuficiente!");
        }
        
    }
}
