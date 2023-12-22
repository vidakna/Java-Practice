package Assignment;

import java.util.Scanner;


public class Student {
   
    private String ID;
	private String name;
    private String address;
	private int totMark;

	
  
    //attributes for vehicle

    public void inputData(){
    Scanner in=new Scanner(System.in);
    
 

    System.out.println("ID :");
    ID = in.nextLine();

    System.out.println("name :");
    name = in.next();

    System.out.println("address :");
    address = in.next();


    System.out.println("tOTAL MARK:");
    totMark=in.nextInt();

   

}

 public void display(){
    System.out.println(" name:" + name);
		System.out.println("ID: " + ID);
		System.out.println("Address: " +address);
		System.out.println("Total Marks: " + totMark);
 }	
 public void grade(){
    if (totMark>=90){
        System.out.println("Grade A");
    }
    else if(totMark>=70 && totMark<90){
        System.out.println("Grade B");
        }
     if(totMark>=50 && totMark<70){
            System.out.println("Grade C");
            }
            else{
                System.out.println("Fail");
            }
} 
public static void main(String[] args) {
    
    Student obj=new Student();
    obj.inputData();
    obj.display();
    obj.grade();
}



}