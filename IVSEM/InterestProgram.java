/* Write a Java program to implement an interface that declares methods to calculate Simple Interest and Compound Interest.

Accept principal, rate, and time from the user
Validate that all inputs are positive values (> 0)
Display both Simple Interest and Compound Interest.*/
import java.util.Scanner;

interface Interest {
    double simpleInterest(double p, double r, double t);
    double compoundInterest(double p, double r, double t);
}

class InterestCalc implements Interest {

    public double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public double compoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }
}

public class InterestProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p, r, t;

        System.out.println("Enter Principal, Rate, and Time:");
        p = sc.nextDouble();
        r = sc.nextDouble();
        t = sc.nextDouble();

        // Validation
        if (p <= 0 || r <= 0 || t <= 0) {
            System.out.println("Invalid input! Values must be positive.");
            return;
        }

        InterestCalc obj = new InterestCalc();

        System.out.println("Simple Interest: " + obj.simpleInterest(p, r, t));
        System.out.println("Compound Interest: " + obj.compoundInterest(p, r, t));
    }
}
