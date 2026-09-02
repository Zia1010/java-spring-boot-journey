public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Error: Salary cannot be negative.");
        } else {
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        Employee emp = new Employee("Zia", 5000);

        emp.setName("");

        emp.setSalary(-100);
    }
}
