public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciou o programa no método main.");
        primeiroMetodo();
        System.out.println("Finalizou o programa no método main.");
    }
    static void primeiroMetodo(){
        System.out.println("Entrou no primeiro método.");
        segundoMetodo();
        System.out.println("Finalizou o primeiro método.");
    }
    static void segundoMetodo(){
        System.out.println("Entrou no segundo método;");
        for(int i = 0; i<=4; i++) System.out.println(i);
        terceiroMetodo();
        System.out.println("Finalizou o segundo metodo.");

    }
    static void terceiroMetodo(){
        System.out.println("Entrou no terceiro método.");
        //Thread.dumpStack(); //gera uma Stack Trace
        System.out.println("Finalizou o terceiro método. ");

    }

}
