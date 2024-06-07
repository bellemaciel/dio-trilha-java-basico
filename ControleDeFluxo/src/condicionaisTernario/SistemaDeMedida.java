package condicionaisTernario;
import java.util.Scanner;

public class SistemaDeMedida {
    //Esse código poderia usar melhor o else if
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sigla do tamanho: ");
        String sigla = scan.next();
        scan.close();

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
        
            default:
                System.out.println("Indefinido!");
                break;
        }




    }
}
