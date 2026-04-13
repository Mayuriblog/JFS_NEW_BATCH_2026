/* Write a Java program to implement an interface
that declares methods to calculate GCD (Greatest Common Divisor) 
and LCM (Least Common Multiple) of two positive integers. 

Accept input from the user
Validate that inputs are positive integers (> 0)
Display both GCD and LCM */
import java.util.Scanner;

interface MathOperations {
    int findGCD(int a, int b);
    int findLCM(int a, int b);
}

class Calculate implements MathOperations {

    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}

public class GCDLCMProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Enter two positive integers:");
        a = sc.nextInt();
        b = sc.nextInt();

        // Validation
        if (a <= 0 || b <= 0) {
            System.out.println("Invalid input! Numbers must be positive.");
            return;
        }

        Calculate obj = new Calculate();

        System.out.println("GCD: " + obj.findGCD(a, b));
        System.out.println("LCM: " + obj.findLCM(a, b));
    }
}