import java.lang.*;
interface CalcIntf
{
	int add(int a,int b);  
	int sub(int a,int b);
	int mul(int a,int b);
	float div(int a,int b);
}
interface SciIntf extends CalcIntf
{
	double myLog(int a);
	double mySqrt(int a);
	double mySin(int a);
}
class SciCalc implements SciIntf
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public float div(int a,int b)
	{
		return (float)a/b;
	}
	public double myLog(int a)
	{
		return Math.log((double)a);
	}
	public double mySqrt(int a)
	{
		return Math.sqrt((double)a);
	}
	public double mySin(int a)
	{
		double deg=(Math.PI/180)*a;
		return Math.sin(deg);
	}
}
class InheritedIntfDemo
{
	public static void main(String args[])
	{
		SciIntf obj=new SciCalc();
		System.out.println(obj.add(5,4)); //9
		System.out.println(obj.sub(8,2)); //6
		System.out.println(obj.mul(9,3)); //27
		System.out.println(obj.div(8,3)); //2.6666667
		System.out.println(obj.myLog(5)); //1.6094379124341003
		System.out.println(obj.mySqrt(36)); //6.0
		System.out.println(obj.mySin(90)); //1.0
		
		
	}
}
