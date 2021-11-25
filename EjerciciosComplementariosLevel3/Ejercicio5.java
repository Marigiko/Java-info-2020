import java.time.*;
import java.util.List;

public class Ejercicio5 {

     public static class Alumno {
        private String nombre, apellido;
        private LocalDate fechaDeNacimiento;

        public Alumno (String nombre, String apellido, LocalDate fechaDeNacimiento){
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaDeNacimiento = fechaDeNacimiento;
        }

        public String getFields(){
            return nombre + "\n" + apellido + "\n" + fechaDeNacimiento;
        }
    } 
    
    public static void main(String[] args)
        {
            List<Alumno> alumnos = List.of( 
                new Alumno("Homero", "Simpson", LocalDate.parse("1973-06-24")),
                new Alumno("Marge", "Simpson", LocalDate.parse("1975-08-15")),
                new Alumno("Bart", "Simpson", LocalDate.parse("1995-03-03")),
                new Alumno("Lisa", "Simpson", LocalDate.parse("1997-12-16")),
                new Alumno("Maggie", "Simpson", LocalDate.parse("2000-07-20"))
            );

            for (int i = 0; i < alumnos.size(); i++) {
                System.out.println(alumnos.get(i).getFields());
            }
            
        }
    }