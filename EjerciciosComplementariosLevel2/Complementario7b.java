import java.util.*;

public class Complementario7b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;

        System.out.print("Enter number one: ");
        start = scanner.nextInt();
        System.out.print("Enter number two: ");
        end = scanner.nextInt();

        scanner.close();
        System.out.println(FizzBuzz(start, end));
    }

    public static List<String> FizzBuzz(int start, int end) {
        List<String> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if (i % 2 == 0 && i % 3 == 0)
                result.add("FizzBuzz");
            else if (i % 2 == 0)
                result.add("Fizz");
            else if (i % 3 == 0)
                result.add("Buzz");
            else
                result.add(String.valueOf(i));
        }
        return result;
    }
}