import java.util.*;
class Student
{
	String rollno;
	String name;
	int marks;
	private String batch;
	Student(String r,String n,int m)
	{
		rollno=r;
		name=n;
		marks=m;
	}
	void show()
	{
		System.out.println("roll no. :"+rollno+"\t Name : "+name+"\t marks: "+marks+"\t Batch :"+batch);
	}
	public void setBatch(String batch)
	{
		this.batch=batch;
	}
}
class BatchSelection
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> examlist;
		examlist=new ArrayList<>();
		System.out.println("Enter no. of students: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter roll no. , name , marks");
			String r=sc.next();
			String n=sc.next();
			int m=sc.nextInt();
			Student s=new Student(r,n,m);
			examlist.add(s);
		}
		ArrayList<Student> sb1=new ArrayList<>();
		ArrayList<Student> sb2=new ArrayList<>();
		for(int i=0;i<num;i++)
		{
			Student s=examlist.get(i);
			if(s.marks>75)
			{
				sb1.add(s);
				s.setBatch("SB1");
			}
			else
			{
				sb2.add(s);
				s.setBatch("SB2");
			}
					
		}
		System.out.println("sb1 student list: "+sb1.size());
		for(Student s:sb1)
			s.show();
		System.out.println("sb2 student list: "+sb2.size());
		for(Student s:sb2)
			s.show();
		
		
	}
}