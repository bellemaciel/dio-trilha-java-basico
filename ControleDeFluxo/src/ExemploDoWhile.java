// ExemploDoWhile.java

import java.util.Random;
public class ExemploDoWhile {
public static void main(String[] args) {
	
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());//
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(6)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;//invertendo o valor boleano, quando atendeu for true ele retornará false e 
        //acabará com o loop
	}
}
