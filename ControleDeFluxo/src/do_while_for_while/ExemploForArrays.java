package do_while_for_while;

public class ExemploForArrays {
    public static void main(String[] args) {
        String alunos[] = {"MÁRCIA", "FELIPE", "SHOSHANA", "EURÍPEDES"};

        for(int i = 0; i < alunos.length; i++)// pois o número do tamanho do array é maior que o número do último índice do array, 
        //porque ele começa pelo índice 0; exemplo array de 3 posições tem o último índice 2
            System.out.println("Aluno do índice "+i+" é -> "+alunos[i]);


        for(String nome : alunos)//forma abreviada de percorrer arrays
            System.out.println("Nome do aluno é: "+nome);
    }
}
