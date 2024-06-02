import java.util.Scanner;

public class PlanoOperadora {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o plano : ");
        String plano = scan.nextLine();

        switch (plano) {
            case "T":
                System.out.println("5GB Youtube.");
                
            case "M":
                System.out.println("WhatsApp e Instagram grátis.");
            
            case "B":
                System.out.println("100 minutos de ligação.");
        
            default:
                break;
        }
    }
}
