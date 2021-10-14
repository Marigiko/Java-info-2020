import java.util.Scanner;

public class Complementario5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        scan.close();
        int numC = 0;

        for(int i = 0; i < numA; i++) {
            numC = numC + numB;
        }

        System.out.println(numA + " x " + numB + " = " + numC);
    }

}