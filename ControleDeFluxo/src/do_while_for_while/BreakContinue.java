package do_while_for_while;

public class BreakContinue{
    public static void main(String[] args) {
        
        for(int i = 1; i <=5; i++){
            if(i == 3)
                break;// interrompe o for
            System.out.println(i);
        }

        System.out.println("\n Fim do break - início do continue: \n");

        for(int i = 1; i <=5; i++){
            if(i == 3)
                continue;// muda o fluxo, volta ao for sem imprimir o número 3
            System.out.println(i);
        }
    }







}