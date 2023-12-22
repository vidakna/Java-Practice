package Tutorial;

import java.util.Scanner;

public class triangle extends inherit {
     public static void triangleoutput() {

       
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the height of Triangle :");
            double trihei =in.nextDouble();
    
            System.out.println("Enter the side A of Triangle :");
            double sideA =in.nextDouble();
    
            System.out.println("Enter the side B of Triangle :");
            double sideB =in.nextDouble();
            
           System.out.println("Enter the side C of Triangle :");
            double sideC =in.nextDouble();
    
    
      
      
        TriArea(sideB,trihei);
        TriPerimeter(sideA,sideB,sideC);
    }
   
       
    
    public static void TriArea(double sideB,double trihei ) {

        double Area2 = sideB * trihei * 0.5;
        System.out.println("Area of the Triangle :" +Area2);
    }

    public static void TriPerimeter(double sideA,double sideB,double sideC) {
        
        double per2= sideA + sideB + sideC;
        System.out.println("Perimeter of the Triangle :" +per2);
    }
}
