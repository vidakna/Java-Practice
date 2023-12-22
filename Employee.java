import java.util.Scanner;

public class Employee {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Employee Number");
        String Emp=in.nextLine();

        System.out.println("Enter Your Name");
        String name=in.nextLine();

        System.out.println("Enter Your basic salary");
        float salary=in.nextFloat();

        details(name, Emp, salary);
        allowance(salary);
        netsalary(salary);
    }

    public static void allowance( Float salary) {
		double allo,netSal;
		if(salary>=50000) {
			allo=(salary*8/100);
			System.out.println("Your Allowance : "+allo);
		}else if(salary>=30000 && salary<=50000) {
			allo=(salary*5/100);
			System.out.println("Your Allowance : "+allo);
		}else {
			allo=(salary*2/100);
			System.out.println("Your Allowance : "+allo);
		}
		
   }   
   public static void netsalary( Float salary) {
		double allo,netsal;
		if(salary>=50000) {
			allo=(salary*8/100);
      netsal=allo+salary;
			System.out.println("Your net salary : "+netsal);
		}else if(salary>=30000 && salary<=50000) {
			allo=(salary*5/100);
      netsal=allo+salary;
			System.out.println("Your net salary : "+netsal);
		}else {
			allo=(salary*2/100);
      netsal=allo+salary;
			System.out.println("Your net salary : "+netsal);
		}
		
   }   
   public static void details(String name, String Emp,float salary) {
    System.out.println("Name:" +name);
    System.out.println("Employee Number: "+ Emp);
    System.out.println("Employee Basic Salary: "+salary);
}
}