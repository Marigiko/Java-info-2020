import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Ejercicio1 {
	/*
	public static void main(String[] args) {
		List<String> palabras = new ArrayList<>();
		palabras.add("Hola");
		palabras.add(null);
		palabras.add("Informatorio");
		palabras.add("");
		palabras.stream();

		for (int i = 0; i < palabras.size(); i++) {
			if (palabras.get(i) == null || palabras.get(i) == "") {
				palabras.remove(i);
				i = i - 1;
			}
		}
		palabras.list();

		System.out.println(palabras);
	}
	*/
	public static void main(String[] args) {
		List<String> palabras = new ArrayList<>();
		palabras.add("Hola");
		palabras.add(null);
		palabras.add("Informatorio");
		palabras.add("");
		List<String> array = palabras.stream()
		.filter(e -> e != null && e != "")
		.collect(Collectors.toList());

		System.out.println(array);
	}
}
