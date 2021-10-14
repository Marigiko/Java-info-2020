import java.util.Scanner;

public class Complementario4 {

    static Scanner scan = new Scanner(System.in);

    public static long factorialNum(int num) {

        long fact = 1;

        for (int i = 1 ; i <= num; i++) {

            fact = fact * i;

        }

        return fact;

    }

    public static void main(String[] args) {

        
        int numero;

        int y = 1;

        while (y == 1) {

            System.out.println("Por favor ingrese un número: ");
            numero = scan.nextInt();

            System.out.println(factorialNum(numero));
            System.out.println("Ingrese 0 para salir");

            y = scan.nextInt();

        }
        scan.close();

    }

}
