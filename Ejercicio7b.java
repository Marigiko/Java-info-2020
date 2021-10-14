import java.util.Scanner;

public class Ejercicio7b {

    public static int Factorial(int num) {


        if (num == 0) {

            return 1 ;

        }
        else {

            int resultado = num * Factorial(num - 1);

            return resultado;

        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println(Factorial(num));
        
        scan.close();

    }

}