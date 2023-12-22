package Tutorial;

import java.util.Scanner;

public class calculate {
     public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
       
       System.out.println("Enter your first Integer :");
       int first =in.nextInt();

       System.out.println("Enter your Second Integer :");
       int second=in.nextInt();

       int sum;
       sum=first+second;
       System.out.println("Sum of two Integers=" +sum);
    }
}
