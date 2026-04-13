/* Write a Java program to find the largest number among 
four variables using only conditional statements (if-else), 
without using arrays. */

import java.util.Scanner;

public class LargestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Enter four numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int largest;

        if (a >= b && a >= c && a >= d) {
            largest = a;
        } else if (b >= a && b >= c && b >= d) {
            largest = b;
        } else if (c >= a && c >= b && c >= d) {
            largest = c;
        } else {
            largest = d;
        }

        System.out.println("Largest number is: " + largest);
    }
}