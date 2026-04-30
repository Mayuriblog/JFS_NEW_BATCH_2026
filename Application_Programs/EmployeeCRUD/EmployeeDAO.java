import java.util.*;
interface EmployeeDAO
{
    void addEmployee(Employee e);
    Employee getEmployee(int id);
    boolean updateEmployee(int id, String name, double salary);
    boolean deleteEmployee(int id);
    void viewAll();
}