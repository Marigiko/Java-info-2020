import java.time.*;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class Ejercicio5 {

    /*
     * public static class Alumno {
     * private String nombre, apellido;
     * private LocalDate fechaDeNacimiento;
     * 
     * public Alumno (String nombre, String apellido, LocalDate fechaDeNacimiento){
     * this.nombre = nombre;
     * this.apellido = apellido;
     * this.fechaDeNacimiento = fechaDeNacimiento;
     * }
     * 
     * public String getFields(){
     * return nombre + "\n" + apellido + "\n" + fechaDeNacimiento;
     * }
     * }
     * 
     * public static void main(String[] args)
     * {
     * List<Alumno> alumnos = List.of(
     * new Alumno("Homero", "Simpson", LocalDate.parse("1973-06-24")),
     * new Alumno("Marge", "Simpson", LocalDate.parse("1975-08-15")),
     * new Alumno("Bart", "Simpson", LocalDate.parse("1995-03-03")),
     * new Alumno("Lisa", "Simpson", LocalDate.parse("1997-12-16")),
     * new Alumno("Maggie", "Simpson", LocalDate.parse("2000-07-20"))
     * );
     * 
     * for (int i = 0; i < alumnos.size(); i++) {
     * System.out.println(alumnos.get(i).getFields());
     * }
     * 
     * }
     */

    public static class Alumno {
        private String nombre, apellido;
        private LocalDate fechaDeNacimiento;

        public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaDeNacimiento = fechaDeNacimiento;
        }
    }

    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Homero", "Simpson", LocalDate.parse("1973-06-24")),
                new Alumno("Marge", "Simpson", LocalDate.parse("1975-08-15")),
                new Alumno("Bart", "Simpson", LocalDate.parse("1995-03-03")),
                new Alumno("Lisa", "Simpson", LocalDate.parse("1997-12-16")),
                new Alumno("Maggie", "Simpson", LocalDate.parse("2000-07-20")));

        /*Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < alumnos.size(); i++) {
            map.put((alumnos.get(i).nombre + " " + alumnos.get(i).apellido), alumnos.get(i).fechaDeNacimiento.getYear());
        }*/

        Map<String, Integer> map = new HashMap<>();
        alumnos.stream().forEach(e -> map.put((e.nombre + " " + e.apellido), calcularEdad(e.fechaDeNacimiento)));

        System.out.println(map);
    }

    public static int calcularEdad(LocalDate fecha) {

        Calendar fechaActual = Calendar.getInstance();

        int año = fechaActual.get(Calendar.YEAR) - fecha.getYear();
        int mes = fechaActual.get(Calendar.MONTH) - fecha.getDayOfMonth();
        int dia = fechaActual.get(Calendar.DATE) - fecha.getDayOfYear();

        if(mes<0 || (mes==0 && dia<0)){
           año--;
       }

       return año;
    }
}