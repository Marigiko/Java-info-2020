import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Complementario1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> ciudades = new ArrayList<>();
        char pregunta = 'y';
        do {
            System.out.print("Ingresa una ciudad de Argentina: ");
            ciudades.add(scanner.nextLine());
            System.out.print("Continuar? (Y/n): ");
            pregunta = scanner.nextLine().charAt(0);
        } while (pregunta == 'y');
        scanner.close();
        int index = 1;
        for (String ciudad : ciudades) {
            System.out.println(String.format("#%d - %s", index++, ciudad));
        }

    }
}
