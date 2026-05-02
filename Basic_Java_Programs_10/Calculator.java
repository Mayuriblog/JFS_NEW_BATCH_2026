import java.util.*;

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1.Add 2.Sub 3.Mul 4.Div 5.Exit");
            int choice = sc.nextInt();

            if(choice == 5) break;

            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            switch(choice) {
                case 1: System.out.println("Result = " + (a+b)); break;
                case 2: System.out.println("Result = " + (a-b)); break;
                case 3: System.out.println("Result = " + (a*b)); break;
                case 4:
                    if(b!=0) System.out.println("Result = " + (a/b));
                    else System.out.println("Cannot divide by zero");
                    break;
                default: System.out.println("Invalid choice");
            }
        }
    }
}