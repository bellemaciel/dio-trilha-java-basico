package do_while_for_while;
import java.util.Random;

public class RandomExemplo {

    public static void main(String[] args) {

        //instância um objeto da classe Random usando o construtor básico
        Random gerador = new Random();
        
        //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(26));//inteiro gerado na faixa entre 0 e 26 - 1(25)
         }
    }
}

