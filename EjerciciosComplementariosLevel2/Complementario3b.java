import java.util.*;

public class Complementario3b {
    public static void main(String[] args) {
        List<String> cards = new ArrayList<>(
                Arrays.asList("A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
        
        for (String card : cards) {
            System.out.println(card);
        }
        System.out.println("====================================");

        ListIterator<String> li = cards.listIterator(cards.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println("====================================");

        Collections.shuffle(cards);
        for (String card : cards) {
            System.out.println(card);
        }
    }
}