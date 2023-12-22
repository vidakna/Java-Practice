import java.util.Scanner;



public class animal {
	
 public static void main(String args[]) 
    {
		String[] animalarrey = {"Elephant", "Rabbit", "Rat", "Dog","Cat","Cow","Goat"};
		
		
		Scanner ani=new Scanner(System.in);
		System.out.println("Enter an animals' name ('Elephant','Rabbit','Rat','Dog','Cat','Cow','Goat'): ");
		String userani=ani.nextLine();
		
        
        for (int count=0;count< animalarrey.length; count++) 
        {
			if (userani.equals(animalarrey[count])) 
            {
				System.out.println(animalarrey[count]+" is in the "+(count+1 )+" position (index "+count+") of the animal array. ");
				break;
			}
			else if (count==6)
	            System.out.println("this animal is not in array"); 
                       
		}
		
	}
	
	
}