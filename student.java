import java.util.Scanner;

public class student {
 public static void main(String[] args) {
      
  Scanner in=new Scanner(System.in);
  System.out.println("Enter your Index Number");
  String index=in.nextLine();

  System.out.println("Enter your First Name");
  String fname=in.nextLine();
    
  System.out.println("Enter your Last Name");
  String lname=in.nextLine();

  System.out.println("Enter your Age");
  int age=in.nextInt();

  System.out.println("Enter your 1st Test marks");
  float mark1=in.nextFloat();

  System.out.println("Enter your 2nd Test marks");
  float mark2=in.nextFloat();

  Name(fname,lname);
  Index(index);
  Total(mark1,mark2);
  Avarage(mark1,mark2);
  Grade(mark1,mark2);
  }


  public static void Name(String fname,String lname) {
      System.out.println("Your Name is "+fname+ " "+lname);
  }
  public static void Index(String index) {
    System.out.println("Your Index Number is "+index);
}
  public static void Total(float mark1,float mark2) {
      System.out.println("Your Total marks in both of test "+mark1+mark2);
  }
  public static void Avarage(float mark1,float mark2) {
      double avg;
      float total;
      total= mark1+mark2;
      avg=total/2;
      System.out.println("Your Avarage Marks "+avg);
  }
  public static void Grade(float mark1,float mark2) {
    double avg=(mark1+mark2)/2;
    if(avg>=50) {
    System.out.println("Grade: Pass");
    }else 
    {
        System.out.println("Grade: Fail");
    }
}
}
