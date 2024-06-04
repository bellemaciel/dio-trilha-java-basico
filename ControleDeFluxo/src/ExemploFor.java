import java.util.Scanner;

public class ExemploFor {
   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quantos carneirinhos Joãozinho deve contar? ");
    int carneirinhos = scanner.nextInt();
    scanner.close();//fecha o scanner

    for(int i = 1; i <= carneirinhos; i++)
        System.out.println(i+" - Carneirinho(s)");

    System.out.println("Joãozinho dormiu!");
   } 

   
}
