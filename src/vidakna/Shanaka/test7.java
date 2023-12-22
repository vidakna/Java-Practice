package vidakna.Shanaka;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of Elements you want to store");
        int n=in.nextInt();
        System.out.println("Enter the number of the array");
       // int m=in.nextInt();
        int array[]=new int[10];
        for( int i=0; i<n; i++){
             array[i]=in.nextInt();
            
        }
           
        for( int i=0; i<n; i++){
            
            System.out.print(array[i] +"\t");
       }
          
  }
}

