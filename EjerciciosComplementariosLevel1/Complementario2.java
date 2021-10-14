import java.util.Scanner;

public class Complementario2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        scan.close();

        System.out.println(numA + " + " + numB + " = " + (numA + numB));
        System.out.println(numA + " - " + numB + " = " + (numA - numB));
        System.out.println(numA + " * " + numB + " = " + (numA * numB));
        System.out.println(numA + " / " + numB + " = " + (numA / numB));
        System.out.println(numA + " % " + numB + " = " + (numA % numB));
    }

}