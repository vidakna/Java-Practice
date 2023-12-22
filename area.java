import java.util.Scanner;

public class area {
     public static void main(String[] args) {
        Scanner radius=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float r =radius.nextFloat();
        final double pi = 3.14;
        double area= pi*r*r;
        System.out.println("Area of the circle: "+area);
        
    }
}
