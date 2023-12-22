package Intermediate;

import java.util.Scanner;

public class VideoStartswithEndswith {
    public static void main(String[] args) {
        // Scanner in=new Scanner (System.in);
        // System.out.println("Enter number of array u want to store");
        // int n=in.nextInt();

        // int[] array=
        String[] words={"funk","chunk","furry","baconator","Vidakna","church","fast"};

//startswith
        for(String w:words){
            if(w.startsWith("f"))
                System.out.println(w + " starts with f");
               else
               System.out.println(w + " is not  starts with f" ); 
                
        }
//end with
        for(String w:words){
            if(w.endsWith("k"))
                System.out.println(w + " ends with k");
               else
               System.out.println(w + " is not  ends with k" ); 
                
        }
       
    }
}
