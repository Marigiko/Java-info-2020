import java.util.*;

public class Complementario4b {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Ivan", "Angel", "Emilio", "Elias", "Lucas", "Matias", "Facundo", "Nicolas",
                "Jose", "Maximiliano", "Braian", "Santiago"));

        List<List<String>> courses = new ArrayList<List<String>>();

        for (int i = 0; i < 3; i++) {
            courses.add(students.subList(0 + 4 * i, 3 + 4 * i));
        }

        System.out.println(courses);

        int count = 1;
        for (List<String> course : courses) {
            System.out.println("course #" + (count++) + ": " + course);
        }
    }
}