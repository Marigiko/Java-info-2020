import java.util.Scanner;

public class Complementario8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, city, address;
        System.out.print("Ingresa tu nombre y apellido: ");
        name = scanner.nextLine();
        System.out.print("Ingresa tu edad: ");
        int age = Integer.valueOf(scanner.nextLine());
        System.out.print("Ingresa tu ciudad: ");
        city = scanner.nextLine();
        System.out.print("Ingresa tu dirección: ");
        address = scanner.nextLine();
        scanner.close();

        System.out.println(String.format("{%s} - {%s} - {%d} - {%s}", city, address, age, name));
    }
}