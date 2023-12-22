package Tutorial;

import java.util.Scanner;



public class inherit {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         System.out.println("Enter 1 for Square or Enter 2 for Traingle :");
          int user= in.nextInt();

        if(user==1){

        square obj2=new square();
        obj2.squareoutput();
        }
        else if(user==2){

        triangle obj1 =new triangle();
        obj1.triangleoutput();
        }
        else 
            System.out.println("Invalid number");

    }
   
   }
