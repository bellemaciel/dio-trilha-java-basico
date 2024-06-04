import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomTeste {
  
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
       }
   public static void main(String[] args) {
   
    double valorTeste = 0;
    double valorControle = 0;
    while( valorControle < 30){
         valorTeste = valorAleatorio();
         valorControle += valorTeste;
         System.out.println("Número gerado aleatoriamente: "+valorTeste);
         
    }
    System.out.println("Soma de valores aleatórios: "+valorControle);
   } 
}
