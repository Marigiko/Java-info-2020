import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class Ejercicio2 {
	/*
	public static void main(String[] args) {
		List<Integer> palabras = List.of(1,2,3,4,5);
		List<Integer> palabrasAlCuadrado = new ArrayList<Integer>();

		for (int i = 0; i < palabras.size(); i++) {
			palabrasAlCuadrado.add(palabras.get(i) * palabras.get(i));
		}
		System.out.println(palabrasAlCuadrado);
	}
	*/
	public static void main(String[] args) {
		List<Integer> palabras = List.of(1,2,3,4,5);
		List<Integer> palabrasAlCuadrado = palabras.stream()
		.map(num -> num * num)
		.collect(Collectors.toList());

		System.out.println(palabrasAlCuadrado);
	}
}
