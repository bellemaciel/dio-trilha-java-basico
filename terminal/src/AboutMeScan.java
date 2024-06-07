import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class AboutMeScan {
    public static void main(String[] args) {
       
       try{  //  bloco de código conforme esperado
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        scanner.close();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
       }
       catch(InputMismatchException e){
        System.out.println("Os campos de Idade e Altura precisam ser numéricos!");

       }// precisamos saber qual exceção
  // bloco de código que captura as exceções que podem acontecer
  // em caso de um fluxo não previsto
    }
}
