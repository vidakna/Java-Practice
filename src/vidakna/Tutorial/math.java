package Tutorial;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       
        System.out.println("Enter your first value :");
        double first =in.nextDouble();
 
        System.out.println("Enter your Second value :");
        double second=in.nextDouble();

        System.out.println("Enter your Operator(+,-,*,/) :");
        String opt=in.next();

        switch (opt) {
            case "+" :
                {
                    double sum=first+second;
                    System.out.println("Answer ="+sum);
                }
                break;
             case "-" :
                {
                    double subtract=first-second;
                    System.out.println("Answer ="+subtract);
                }
                break;
                case "*" :
                {
                    double multiply=first*second;
                    System.out.println("Answer="+multiply);
                }
                break;
                case "/" :
                {
                    double divide=first/second;
                    if (second==0)
                 System.out.println("Undefined Value...Please change the second value");
                 else
                    System.out.println("Answer ="+divide);
                }
               
                break;
            default:
                 System.out.println("Invalid");
                break;
        }
 
        
    }
    
}
