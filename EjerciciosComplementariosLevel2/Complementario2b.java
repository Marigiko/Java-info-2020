import java.util.ArrayList;
import java.util.List;

public class Complementario2b {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int min = 0;
        int max = 20;
        for (int i = 0; i < 5; i++) {
            int rand = (int) (Math.random() * (max - min + 1) + min);
            numbers.add(rand);
        }
        show(numbers);
        numbers.add(0, 8);
        numbers.add(numbers.size(), 11);
        show(numbers);
    }

    public static void show(List<Integer> numbers){
        for (Integer integer : numbers) {
            System.out.println(integer);
        }
        System.out.println("====================================");
    }

}
