import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class EmployeeManagement {

    public static class Employee {
        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
        }
    }

    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (predicate.test(emp)) {
                result.add(emp);
            }
        }
        return result;
    }

    public static Optional<Employee> findEmployeeById(List<Employee> employees, int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return Optional.of(emp);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Zia", 45000),
                new Employee(2, "Ali", 60000),
                new Employee(3, "Zubair", 55000)
        );

        Predicate<Employee> highSalary = emp -> emp.getSalary() > 50000;
        List<Employee> highEarners = filterEmployees(employees, highSalary);
        System.out.println("High Earners: " + highEarners);

        Optional<Employee> foundEmployee = findEmployeeById(employees, 2);
        if (foundEmployee.isPresent()) {
            System.out.println("Found Employee: " + foundEmployee.get());
        } else {
            System.out.println("Employee not found");
        }

        Optional<Employee> missingEmployee = findEmployeeById(employees, 99);
        if (missingEmployee.isPresent()) {
            System.out.println("Found Employee: " + missingEmployee.get());
        } else {
            System.out.println("Employee not found");
        }
    }
}
