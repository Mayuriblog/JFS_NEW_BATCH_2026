import java.util.*;

class EmployeeSystem {

    public static void main(String[] args) {

        // EmployeeID -> Department
        HashMap<Integer, String> empDept = new HashMap<>();

        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "HR");
        empDept.put(104, "Finance");
        empDept.put(105, "IT");

        // EmployeeID -> Name
        HashMap<Integer, String> empName = new HashMap<>();
        empName.put(101, "Alice");
        empName.put(102, "Bob");
        empName.put(103, "Charlie");
        empName.put(104, "David");
        empName.put(105, "Eve");

        // 🔹 1. Get Department of Employee
        int id = 102;
        System.out.println("Department of " + empName.get(id) + ": " + empDept.get(id));

        // 🔹 2. Group Employees by Department
        HashMap<String, List<String>> deptMap = new HashMap<>();

        for (int empId : empDept.keySet()) {
            String dept = empDept.get(empId);
            String name = empName.get(empId);

            deptMap.putIfAbsent(dept, new ArrayList<>());
            deptMap.get(dept).add(name);
        }

        System.out.println("\nEmployees grouped by Department:");
        System.out.println(deptMap);

        // 🔹 3. Count Employees per Department
        HashMap<String, Integer> countMap = new HashMap<>();

        for (String dept : empDept.values()) {
            countMap.put(dept, countMap.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\nEmployee Count per Department:");
        System.out.println(countMap);
    }
}
/*
Find department with maximum employees

String maxDept = null;
int max = 0;

for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
    if (entry.getValue() > max) {
        max = entry.getValue();
        maxDept = entry.getKey();
    }
}

System.out.println("Department with max employees: " + maxDept);
*/