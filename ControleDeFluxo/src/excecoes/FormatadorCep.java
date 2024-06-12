package excecoes;
import java.util.Scanner;

public class FormatadorCep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CEP: ");
        String cep = scanner.nextLine(); 
        scanner.close();
       
        try {
            cep = formatarCep(cep);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();//gerado automaticamente, imprime a "árvore de erros"
            System.out.println("O CEP não corresponde com as regras de negócio.");
        }
        System.out.println(cep);
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
    
}
