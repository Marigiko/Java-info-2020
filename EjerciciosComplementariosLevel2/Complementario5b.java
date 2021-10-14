import java.util.ArrayList;
import java.util.List;

public class Complementario5b {
    public static void main(String[] args) {
        List<Integer> workedHours = new ArrayList<>();
        List<Float> valueHours = new ArrayList<>();
        int min = 0;
        int max = 20;
        for (int i = 0; i < 5; i++) {
            workedHours.add((int) (Math.random() * (max - min + 1) + min));
            valueHours.add((float)(Math.random() * (max - min + 1) + min));
        }

        List<Float> subtotals = new ArrayList<>();
        if (workedHours.size() == valueHours.size()) {
            for (int i = 0; i < workedHours.size(); i++) {
                subtotals.add((workedHours.get(i) * valueHours.get(i)));
            }
        }

        Float total = 0f;
        for (Float subtotal : subtotals) total += subtotal;

        System.out.println(total);
    }
}
