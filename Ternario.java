package dio.ternario;

public class Ternario {

    public static void main (String[] args) {
     
        int a, b;
        a = 6;
        b = 6;

        //Utilizando operador ternário ao invés da condição if
        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }    
}
