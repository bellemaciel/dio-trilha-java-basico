import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        int nota = scan.nextInt();

        if(nota >= 7)// retorna true ou false, tem que ser true para executar o código
        System.out.println("Aprovado!");

        else if(nota >= 5 && nota <7)
        System.out.println("Recuperação!");

        else
        System.out.println("Reprovado!");

    }
}
