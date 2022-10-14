package dio.metodo;

public class Metodo {
    
    public static void main(String[] args) {
        
        String primeiroNome = "Brenda";
        String segundoNome = "Rachel";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    // o método deve conter o nome (geralmente no infinitivo, mas neste caso não) e os parâmetros em parênteses
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);

    }

}

