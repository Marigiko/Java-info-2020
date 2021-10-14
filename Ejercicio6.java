
//importamos Scanner para pedir datos al usuario
import java.util.Scanner;

//Creamos la clase principal
public class Ejercicio6 {

    // Creamos la funcion encargada de sumar los numeros
    public static Integer sumarNumeros(int num1, int num2) {

        // Definimos una variable la cual realiza la operacion
        int resultado = num1 + num2;

        // retornamos la variable con el resultado
        return resultado;

    }

    // Creamos la funcion principal
    public static void main(String[] args) {

        // Creamos un Scanner para pedir datos
        Scanner scan = new Scanner(System.in);
        // el dato ingresado lo asignamos a una variable tipo int
        int num1 = scan.nextInt();
        // el dato ingresado lo asignamos a una variable tipo int
        int num2 = scan.nextInt();
        //Cerramos el Scanner
        scan.close();

        //Mostramos por pantalla el resultado final
        System.out.println(sumarNumeros(num1, num2));
    }

}
