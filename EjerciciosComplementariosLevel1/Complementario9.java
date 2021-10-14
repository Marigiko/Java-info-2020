import java.util.Scanner;

public class Complementario9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String string = scanner.nextLine();
        System.out.print("Ingresa un caracter: ");
        char character = scanner.next().charAt(0);
        scanner.close();
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == character)
                count++;
        }
        System.out.println(count);
    }
}