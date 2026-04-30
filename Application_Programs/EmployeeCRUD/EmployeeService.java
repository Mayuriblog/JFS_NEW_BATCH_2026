class EmployeeService
{
    EmployeeDAO dao = new EmployeeDAOImpl();

    void add(int id, String name, double salary)
    {
        if (salary <=0)
        {
            System.out.println("Salary must be positive");
            return;
        }

        dao.addEmployee(new Employee(id, name, salary));
        System.out.println("Employee added successfully");
    }

    void get(int id)
    {
        Employee e = dao.getEmployee(id);

        if (e != null)
            System.out.println(e);
        else
            System.out.println("Employee not found");
    }

    void update(int id, String name, double salary)
    {
        if (salary <=0)
        {
            System.out.println("Salary must be positive");
            return;
        }

        if (dao.updateEmployee(id, name, salary))
            System.out.println("Employee updated successfully");
        else
            System.out.println("Employee not found");
    }

    void delete(int id)
    {
        if (dao.deleteEmployee(id))
            System.out.println("Employee deleted successfully");
        else
            System.out.println("Employee not found");
    }

    void viewAll()
    {
        dao.viewAll();
    }
}