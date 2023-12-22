import java.util.Scanner;

public class Electricity {
     public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of units :");
        double units=in.nextDouble();

        System.out.println("Input 1 for Business and 0 for Home");
        int BH =in.nextInt();

        if (BH==1) {
            System.out.println("Your Electricity bill is :" );
            Business(units);
        }
        else if (BH==0){
            System.out.println("Your Electricity bill is :" );
            home(units);
         } 
        else {
            System.out.println("Invalid Entry");
        }
    } 
       public static void home(double units) {
        double bill=0;

        if (units<=60) 
        {
            bill= (units*7.50)*120/100;
            System.out.println(bill);
        } 

        else if (units>60 && units<=80) 
        {
            bill= (60*7.50 + (units-60) * 10)*120/100;
            System.out.println(bill);
        }

        else if (units>80 && units<=90) 
        {
            bill= 60*7.50 + 20*10 + (units-80) *12.50* 120/100;
            System.out.println(bill);
        }

        else if (units>90 && units<=100) 
        {
            bill= (60*7.50 +20*10+ 10*12.50+(units-90)*15)* 120/100;
            System.out.println(bill);
        }

        else
        {
            bill= (30*units)*120/100;
            System.out.println(bill);
        }
       } 
       public static void Business(double units) {
        double billb=0;

        if (units<=60) 
        {
            billb= (units*7.50)*140/100;
            System.out.println(billb);
        }

        else if (units>60 && units<=80) 
        {
            billb= (60*7.50 + (units-60) * 15)*140/100;
            System.out.println(billb);
        }

        else if (units>80 && units<=90) 
        {
            billb= (60*7.50 + 20*15 + (units-80) *30 )* 140/100;
            System.out.println(billb);
        }

        else if (units>90 && units<=100) 
        {
            billb= (60*7.50 +20*15+ 10*30+(units-90)*60) *140/100;
            System.out.println(billb);
        }

        else
        {
            billb= (120*units)*140/100;
            System.out.println(billb);
        }
       }
}
