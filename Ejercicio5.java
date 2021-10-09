public class Ejercicio5 {

    private static String bienvenida = "Bienvenido";
    public static void main(String[] args) {

    System.out.println(bienvenida);
    
    String hola = "hola";

    imprimirTextoVeces(hola, 3);

    }

    public static void imprimirTextoVeces(String texto, int contador) {

        for (int i = 0; i < contador; i++) {

            System.out.println(texto);
        }

    }

}