import java.util.*;
class DisplayBatch
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter batch name : ");
		String batch=sc.nextLine();
		String digits[] = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX"};
		if(batch.length()==3)
		{
		for(int i=0; i < batch.length(); i++)
		{
			char ch =batch.charAt(i);
			if(i==0 && ch !='S')
			{
				System.out.println("Invalid input");
				break;
			}
			if(i==1 && "BUN".indexOf(ch) == -1)
			{
				System.out.println("Invalid char ...");
				break;
		
			}
			if(i==2 && (ch<49 || ch>54))
			{
				System.out.println("Invalid digit ...");
				break;
		
			}
			if(batch.charAt(i) =='S')
			{
				System.out.printf("SKILL ");
			}
			else if(batch.charAt(i) =='B')
			{
				System.out.printf("BRIDGE ");
			}
			else if(batch.charAt(i) =='U')
			{
				System.out.printf("UP ");
			}
			else if(batch.charAt(i) =='N')
			{
				System.out.printf("NEXT ");
			}
			else if(batch.charAt(i) - 48 > 0)
			{
				int ind = batch.charAt(i) - 48;
				System.out.printf("%s ",digits[ind]);
			}
		}
	
		}
		else
		{
			System.out.println("Invalid batch name ...");
		}
	}
}