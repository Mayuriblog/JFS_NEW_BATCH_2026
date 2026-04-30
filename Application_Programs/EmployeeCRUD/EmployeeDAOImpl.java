import java.util.*;

class EmployeeDAOImpl implements EmployeeDAO
{
    HashMap<Integer, Employee> map = new HashMap<>();

    public void addEmployee(Employee e)
    {
        map.put(e.getId(), e);
    }

    public Employee getEmployee(int id)
    {
        return map.get(id);
    }

    public boolean updateEmployee(int id, String name, double salary)
    {
        if (map.containsKey(id))
        {
            map.put(id, new Employee(id, name, salary));
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(int id)
    {
        return map.remove(id) != null;
    }

    public void viewAll()
    {
        for (Employee e : map.values())
        {
            System.out.println(e);
        }
    }
}