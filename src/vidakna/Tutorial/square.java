package Tutorial;

import java.util.Scanner;

public class square extends inherit {
    public static void squareoutput() {

       
        Scanner in= new Scanner(System.in); 
        System.out.println("Enter the length of Square :");
        double len =in.nextDouble();
    
       
        squArea(len);
        squPerimeter(len);
    }
    
    public static void squArea(double len) {
         double Area1 = len * len;
         System.out.println("Area of the Square :" +Area1);
       
    }

    public static void squPerimeter(double len) {
        double per1= 4 * len;
        System.out.println("Perimeter of the Square :" +per1);
      
    }

}
