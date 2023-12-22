package Assignment;

import java.util.Scanner;

public class Vehical {
    String brandName,color,bodytype;
    int numberOfWheels,seatingCapacity;
    double engineCapacity;

    
public  void inputData(){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the brand name:");
    String brandName=in.nextLine();

    System.out.println("Enter the color :");
    String color=in.nextLine();

    System.out.println("Enter the body type:");
    String bodytype=in.nextLine();

    System.out.println("Enter the Engine capacity:");
    double engineCapacity=in.nextDouble();

    System.out.println("Enter the number Of Wheels:");
    int numberOfWheels=in.nextInt();

    System.out.println("Enter the Seating Capacity:");
    int seatingCapacity=in.nextInt();

    


}
 public  void display(){

System.out.println("Brand name is:"+brandName);
System.out.println("Color is:"+color);
System.out.println("BodyType is:"+bodytype);
System.out.println("Engine Capacity is:"+engineCapacity);
System.out.println("Number of Wheels is:"+numberOfWheels);
System.out.println("Seating Capacity is:"+seatingCapacity);
}

public  void calTax(){
 double Tax=2500 * engineCapacity;
 System.out.println("Tax for your vehical is :"+Tax);
}
}
class Car extends Vehical{

    public static void main(String[] args) {

        
        Scanner car = new Scanner(System.in);

        System.out.println("Input your number of doors: ");
        String numberOfDoors = car.nextLine();

        System.out.println("Input your year of manufacture: ");
        int yearOfManufacture = car.nextInt();


        Car obj=new Car();
        obj.inputData();
       obj.display();
      obj.calTax();
      System.out.println("No of doors of your car :"+numberOfDoors);
        System.out.println("Manufacture year : "+yearOfManufacture);
    }
}