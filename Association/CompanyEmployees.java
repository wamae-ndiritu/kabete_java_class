import java.util.ArrayList;
import java.util.List;

// One-to-Many Relationship

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}

public class CompanyEmployees {
    public static void main(String[] args) {
        // Creating instances
        Company company = new Company("TechCorp");
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");

        company.addEmployee(emp1);
        company.addEmployee(emp2);

        System.out.println("Company: " + company.getName() + ", Employees: "
                + company.getEmployees().stream().map(Employee::getName).toArray());

    }
}
