public class SmartTV {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligarDesliga(){
        ligada = !ligada;
        System.out.println("TV Ligada? "+ligada);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume = "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume = "+volume);
    }

    public void mudarCanal(int n){
        canal = n;
        System.out.println("Canal = "+canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal = "+canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal = "+canal);
    }
}
