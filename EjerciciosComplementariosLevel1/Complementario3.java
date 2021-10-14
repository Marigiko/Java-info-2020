import java.util.*;

public class Complementario3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        List<Integer> array = new ArrayList<Integer> ();

        for(int i = 0; i < num; i++) {
            array.add(i + 1);
            System.out.println(array);

        }

    }

}