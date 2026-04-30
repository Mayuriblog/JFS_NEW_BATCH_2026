import java.util.*;
class EmployeeApp
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		while(true)
		{
			System.out.println("============= Employee Management System ===============\n 1. Add\n 2. Get\n 3. update\n 4. delete\n 5. view all\n 6. exit ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter id,name,salary of an employee");
					   service.add(sc.nextInt(),sc.next(),sc.nextDouble());
					   break;
				case 2:System.out.println("Enter id of an employee for fetching");
					   service.get(sc.nextInt());
					   break;
				case 3:System.out.println("Enter id,name,salary of an employee to be updated");
					   service.update(sc.nextInt(),sc.next(),sc.nextDouble());
					   break;
				case 4:System.out.println("Enter id of an employee to be deleted");
					   service.delete(sc.nextInt());
					   break;
				case 5:System.out.println("All Employees Data");
					   service.viewAll();
					   break;
				case 6:System.out.println("Exiting application...");
                       sc.close();   
                       System.exit(0);
				default: System.out.println("Invalid choice! Try again.");
				
			}
		}
	}
}