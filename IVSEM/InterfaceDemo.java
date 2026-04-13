interface CalcIntf
{
	int add(int a,int b);  
	int sub(int a,int b);
	int mul(int a,int b);
	float div(int a,int b);
}
class Calc implements CalcIntf
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
}
class InterfaceDemo
{
	public static void main(String args[])
	{
		CalcIntf obj=new Calc();
		System.out.println(obj.add(5,4)); //9
		System.out.println(obj.sub(8,2)); //6
		System.out.println(obj.mul(9,3)); //27
		System.out.println(obj.div(8,3)); //2.6666667
	}
}
