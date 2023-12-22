package Tutorial;

public class test1 {
    public static void main(String[] args) {
        double first=25;
        double second=45;
        double third=65;
        double avg=0;

       
        average(first,second,third,avg);

    }

    public static void average(double first,double second,double third,double avg){
    
    avg =(first+second+third)/3;

    System.out.println("Average is :"+avg);
    }

}
