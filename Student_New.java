import java.util.Scanner;

public class Student_New extends Person {//linked to the super class
	
	public static void main(String args[]) {
		Scanner marks=new Scanner(System.in);
		Student_New newobj=new Student_New();
		
		System.out.println("Enter marks for test 01:");
		int mark1=marks.nextInt();
		
		System.out.println("Enter  marks for test 02:");
		int mark2=marks.nextInt();
 
		
		newobj.Details();//call method in Person class
		
		
		calculateAvg( mark1, mark2);//call avg method
		finalGrade(mark1,mark2);//call finalGrade
	
		
	}
	//average
	public static void calculateAvg(int mark1,int mark2) {
		int total,avg;
		total=mark1+mark2;
		avg=total/2;
		System.out.println("Average marks: "+avg);
	}
	//grade
	public static void finalGrade(int mark1,int mark2) {
		
		double avg=mark1+mark2/2;
		if (avg>50) {
			System.out.println("Grade:Pass");
		}else {
			System.out.println("Grade:Fail");
		}
	}
}