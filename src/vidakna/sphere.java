package vidakna;
import java.util.Scanner;

public class sphere {
	
		public static double volume(double r)
		{
			
	        double volume= (4* 3.14*r*r*r)/3;
            return volume;
	    }
		public static void main(String[]arg) 
		{
			Scanner radius = new Scanner(System.in);
					System.out.println("Enter the radius:");
			double r = radius.nextDouble();
			double volume =sphere.volume(r);
			System.out.println("Volume of the Sphere:" + volume);
		}
}
