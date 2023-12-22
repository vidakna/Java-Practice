import java.util.Scanner;

public class blood {
     public static void main(String[] args) {
        Scanner group=new Scanner(System.in);
        System.out.println("Enter your Blood group :");
        String g= group.nextLine();


        switch (g) {
            case "A":
                {
                    System.out.println("you can receive blood from A and O");
                    System.out.println("you can donate for A and AB");
                }
                break;
                case "B":
                {
                    System.out.println("you can receive blood from B and O");
                    System.out.println("you can donate for B and AB");
                }
                break;
                case "AB":
                {
                    System.out.println("you can receive blood from AB,O,A and B");
                    System.out.println("you can donate for AB");
                }
                break;
                case "O":
                {
                    System.out.println("you can receive blood from  O");
                    System.out.println("you can donate for B,AB,A and O");
                }
                break;
            default:
            System.out.println("Invalid Blood Group");
                break;
        }
    } 
        
    
}
