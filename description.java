import java.util.Scanner;

public class description {
    public static void main (String[] args){
    Scanner details=new Scanner(System.in);

    System.out.println("Enter your name :");
    String name=details.nextLine();

    System.out.println("Enter your Age :");
    int age= details.nextInt();
 
    System.out.println("Enter your School :");
    String school= details.next();

    System.out.println("Enter your Date of Birth :");
    String dob= details.next();
 
    System.out.println("Enter your NIC :");
    String nic= details.next();
     
    System.out.println("My Name is " +name);
    System.out.println("My Age is "+age);
    System.out.println("My School is "+school);
    System.out.println("My Birthday is "+dob);
    System.out.println("My National ID Number is "+nic);
    }
}
