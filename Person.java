import java.util.Scanner;
public class Person {
	//main method
	public static void main(String args[]) {
		
		
		Details();//call Detail method
	}
	
	// get and display details
	public static void Details() {
		Scanner details=new Scanner(System.in);
		System.out.println("Enter your ID:");
		int id=details.nextInt();
		
		System.out.println("Enter your name:");
		String name=details.next();
		
		System.out.println("Enter your age:");
		int age=details.nextInt();
		System.out.println("Your ID is :"+id);
		System.out.println("Your name is :"+name);
		System.out.println("Your age is :"+age);
	}
}