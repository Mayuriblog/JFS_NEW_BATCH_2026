//1. Employee Bean (Model Class)
public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}
// 2. Employee DAO Interface

👉 Defines what operations we can do

import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee emp);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
    void deleteEmployee(int id);
}
//3. Employee DAO Implementation

👉 Actual logic (using HashMap as DB)

import java.util.*;

public class EmployeeDAOImpl implements EmployeeDAO {

    private Map<Integer, Employee> db = new HashMap<>();

    @Override
    public void addEmployee(Employee emp) {
        db.put(emp.getId(), emp);
    }

    @Override
    public Employee getEmployee(int id) {
        return db.get(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(db.values());
    }

    @Override
    public void deleteEmployee(int id) {
        db.remove(id);
    }
}
// 4. Employee Service Layer

👉 Business logic layer (important in interviews)

import java.util.List;

public class EmployeeService {

    private EmployeeDAO dao = new EmployeeDAOImpl();

    public void addEmployee(Employee emp) {
        if (emp.getSalary() > 0) {   // business rule
            dao.addEmployee(emp);
        } else {
            System.out.println("Invalid salary");
        }
    }

    public Employee getEmployee(int id) {
        return dao.getEmployee(id);
    }

    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }

    public void deleteEmployee(int id) {
        dao.deleteEmployee(id);
    }
}
// 5. Main Class (Test)
public class Main {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        service.addEmployee(new Employee(1, "Mayuri", 50000));
        service.addEmployee(new Employee(2, "Balaji", 40000));

        System.out.println(service.getEmployee(1));

        System.out.println("All Employees:");
        service.getAllEmployees().forEach(System.out::println);

        service.deleteEmployee(2);

        System.out.println("After Deletion:");
        service.getAllEmployees().forEach(System.out::println);
    }
}