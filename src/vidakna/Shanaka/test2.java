package Shanaka;
import java.util.Random;
public class test2 {
    public static void main(String[] args) {
        Random rnd =new Random();
        int num;
      for(int i=0;i<10;i++){
        num=rnd.nextInt(6);
        System.out.println(num);
      }
       
    }
}
