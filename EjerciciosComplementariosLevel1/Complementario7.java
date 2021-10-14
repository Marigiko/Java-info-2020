import java.util.Scanner;

public class Complementario7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra en minusculas: ");
        String palabra = scanner.nextLine();
        scanner.close();
        String output = "";

        for (char c : palabra.toCharArray()) {
            output += (char) (((int) c) - 32);
        }

        System.out.println(output);
    }
}