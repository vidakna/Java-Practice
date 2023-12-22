package Tutorial;





public class test {
    public static void main(String[] args){
        double first=25;
        double second=37;
        double third=29;
       
         test a=new test();
         a.smallest(first,second,third);


}
public void smallest( double first,double second,double third){

if(first< second && first< third)
   System.out.println("Smallest number is first :"+first);

   else if(second< first && second < third)
   System.out.println("Smallest number is Second :"+ second);

   else
    System.out.println("smallest value is third");
}
}
