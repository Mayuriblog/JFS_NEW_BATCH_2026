
/* Write a Java program that reads n numbers
from the user and finds the max number among them */

import java.util.*;
class MaxNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:  ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int j=0;j<n;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.print("Max Number: "+max);
    }
}
