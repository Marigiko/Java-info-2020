import java.util.Scanner;

public class Complementario6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        scan.close();
        int numC = 0;

        for(int i = 0; i < numA; i++) {
            for(int j = 0; j < numB; j++) {
                numC = numC + numB;
            }
        }

        System.out.println(numA + " elevado a " + numB + " = " + numC);
    }

}