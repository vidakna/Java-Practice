package vidakna;

import java.util.Scanner;

public class cone {
	public static double volume(double r ,double h)
	{
		
        double volume= ( 3.14*r*r*h)/3;
        return volume;
    }
	public static void main(String[]arg) 
	{
		Scanner radius = new Scanner(System.in);
				System.out.println("Enter the radius:");
		double r = radius.nextDouble();
		
		Scanner height = new Scanner(System.in);
		        System.out.println("Enter the height:");
        double h = height.nextDouble();
        
		double volume =cone.volume(r,h);
		System.out.println("Volume of the Cone:" + volume);
	}

}
