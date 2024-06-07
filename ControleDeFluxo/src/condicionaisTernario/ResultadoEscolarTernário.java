package condicionaisTernario;
import java.util.Scanner;

public class ResultadoEscolarTernário {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        int nota = scan.nextInt();
        scan.close();

        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
