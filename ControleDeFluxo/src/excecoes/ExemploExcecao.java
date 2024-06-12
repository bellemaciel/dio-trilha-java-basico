package excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");//gera uma exceção Unchecked

        try {
            valor = NumberFormat.getInstance().parse("a1.75");//gera uma exceção Checked(obrigatório tratar)
        } catch (ParseException e) {
            
            e.printStackTrace();
        }
        System.out.println(valor);
       
    }
}