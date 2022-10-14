package dio.metodo2;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

    //Outros exemplos de métodos para mudar o canal
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar() {
        ligada=true;
    }

    public void desligar() {
        ligada=false;
    }

    
}
