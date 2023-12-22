package Shanaka;



public class test3 {
    public static void main(String[] args) {
      /*  int num[]=new int[10];
        num[0]=12;
        num[2]=45;
        num[7]=86;

        System.out.println(num[7]);

        int numm[]={87,99,64,03};
        System.out.println(numm[2]);

        int numb[]={12,14,54,67};

        for(int i=0;i<4;i++){
            System.out.println(numb[i]);
        }
        int numbe[]={12,14,54,67,88,99};

        for(int i=0;i<numbe.length;i++){
            System.out.println(numbe[i]);
        }
        int[] number ={1,2,3,4,5,6};
        int sum=0;
        
       for(int count=0; count<number.length; count++)
        {
            sum +=number[count];
           
        }
        System.out.println("Sum of numbers : "+sum);
    }
    int[] numbers ={1,2,3,4,5,6};
        int total=0;

        for(int x:numbers){
            total+=x;
        }
        System.out.println(total);*/

        int num[] = {2,3,4,5,6};
        change(num);

        for (int y: num)
            System.out.println(y);
    }

    public static void change(int x[]){

        for(int i = 0; i< x.length; i++)
            x[i] += 10;
    }
}
    