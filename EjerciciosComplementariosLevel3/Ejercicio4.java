import java.util.stream.*;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Ejercicio4 {

    static int factorial(int num){
        int factorial=1;
        while( num != 0){
            factorial *= num;
            num --;
        }
        return factorial;
    }

    static void filtro(List<Integer> palabras){
        
        Set<Integer> items = new HashSet<>();
        palabras.stream()
                .filter(n -> !items.add(factorial(n)))
                .collect(Collectors.toSet());
        System.out.println(items);
            }

    public static void main(String[] args){
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        filtro(palabras);
    }

}