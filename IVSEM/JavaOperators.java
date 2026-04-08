import java.util.*;
class JavaOperators
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a and b values");
		a=sc.nextInt();
		b=sc.nextInt();
		
		// Arithmetic Operators (+,-,*,/,%)
		System.out.println("\n--- Arithmetic Operators ---");
		System.out.println("Addition of a and b: "+ (a+b));
		System.out.println("Subtraction of a and b:  "+(a-b) );
		System.out.println("Multiplication of a and b:  "+(a*b));
		System.out.println("Division of a and b:  "+(a/b));
		System.out.println("Modulo Division of a and b:  "+ (a%b));
		
		// Unary Operators (--,++)
		System.out.println("\n--- Unary Operators ---");
		System.out.println(" Now the values of a :"+ a+" and value of b :"+b);
		System.out.println("Pre Increment of a: "+(++a));
		System.out.println("Post Increment of a:  "+(a++));
		System.out.println("Pre Decrement of a:  "+(--a));
		System.out.println("Post Decrement of a:  "+(a--));
		
		// Logical Operators (&&,||,!)
		System.out.println("\n--- Logical Operators ---");
		System.out.println(" Now the values of a :"+ a+" and value of b :"+b);
        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));
        System.out.println("(a > b) || (a > 0): " + ((a > b) || (a > 0)));
        System.out.println("!(a > b): " + (!(a > b)));
		
		// Ternary Operators ( cond? true: false;)
		System.out.println("\n--- Ternary Operator ---");
		System.out.println(" Now the values of a :"+ a+" and value of b :"+b);
		int max = (a > b) ? a : b; 
		System.out.println("Max Number of "+a+" and "+b+"is:"+ max);
		
		// Assignment Operators ( +=,-=,=,/=,*=,%=)
		System.out.println("\n--- Assignment Operators ---");
		System.out.println(" Now the values of a :"+ a+" and value of b :"+b);
        int x = a;
        System.out.println("x = " + x);
        x += b;
        System.out.println("x += b: " + x);
        x -= b;
        System.out.println("x -= b: " + x);
        x *= b;
        System.out.println("x *= b: " + x);
        x /= b;
        System.out.println("x /= b: " + x);
        x %= b;
        System.out.println("x %= b: " + x);
		
		// Bitwise and Shift Operators (&,|,^,<<,>>,>>>)
		System.out.println("\n--- Bitwise & Shift Operators ---");
		System.out.println(" Now the values of a :"+ a+" and value of b :"+b);
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));
        System.out.println("a >>> 1: " + (a >>> 1));

		// Relational Operators (<,<=,>,>=,==,!=)
		System.out.println("\n--- Relational Operators ---");
		System.out.println(" Now the values of a :"+ a+" and value of b :"+b);
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
		
		// Instance of Operator (object Instance of Integer)
		System.out.println("\n--- Instanceof Operator ---");
		System.out.println(" Now the values of a :"+ a+" and value of b :"+b);
        Integer obj = a;   // wrapper object
        System.out.println("obj instanceof Integer: " + (obj instanceof Integer));
		 sc.close();
	}
}
    