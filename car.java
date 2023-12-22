
import java.util.Scanner;
public class car {
	//constructor
	public car(int carId,String type,int avgSpeed,String color) {
		System.out.println("Car ID is :"+carId);
		System.out.println("Car type is :"+type);
		System.out.println("Average speed is :"+avgSpeed);
		System.out.println("Colour  is :"+color);
		
	}
	//method to increase speed
	public static void avgSpeed(int avgSpeed) {
		int newSpeed;
		newSpeed=avgSpeed*20;
		System.out.println("When increas the speed by 20 :"+newSpeed);
	}
	//method to display the status

	public static void status(int avgSpeed) {
		if (avgSpeed>=80) {
			System.out.println("High speed");
		}
		else if(avgSpeed>=60 && avgSpeed<=80) {
			System.out.println("Moderate speed");
		}else{
			System.out.println("Slow");}
		}
	
//main method
	public static void main (String args[]) {
		//get details from user
		Scanner details=new Scanner(System.in);
		System.out.println("Enter car ID: ");
		int carid=details.nextInt();
		
		System.out.println("Enter car type: ");
		String type=details.next();
		
		System.out.println("Enter average speed : ");
		int avgSpeed=details.nextInt();
		
		System.out.println("Enter car colour : ");
		String color=details.next();
		
		//call constructor
		car newobj= new car(carid,type,avgSpeed,color);
		status(avgSpeed);
		avgSpeed(avgSpeed);
		
	}
	}