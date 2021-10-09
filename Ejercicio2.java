import java.util.*;

public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int continuar = scan.nextInt();

        while (continuar == 0) {
            System.out.println("El primer número ingresado es: " + a);
            System.out.println("El segundo número ingresado es: " + b);
            System.out.println("El tercer número ingresado es: " + c);
            System.out.println("Desea continuar? ");
            continuar = scan.nextInt();
            if (continuar == 0) {
                a = scan.nextInt();
                b = scan.nextInt();
                c = scan.nextInt();
            }
        }
        scan.close();
    }
}
