import java.util.*;

public class Complementario6b {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        load(employees);

        Map<Integer, Float> Employees = new HashMap<>();
        for (Employee employee : employees) {
            Employees.put(employee.getDni(), employee.getSalary());
        }
        System.out.println(Employees);
    }

    public static void load(Set<Employee> employees){
        Employee emp1 = new Employee(1234, "Ivan Stacul", 8, 57.51f);
        Employee emp2 = new Employee(1235, "Juan Perez", 12, 49.73f);
        Employee emp3 = new Employee(1236, "Alberto García", 4, 30.86f);
        Employee emp4 = new Employee(1237, "Eduardo Gimenez", 9, 55.97f);
        
        employees.addAll(Arrays.asList(emp1,emp2,emp3,emp4));
    }

}