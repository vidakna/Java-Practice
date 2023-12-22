package vidakna.Shanaka;

public class T11 {
    public static void main(String[] args) {
        
     orange1 obj=new orange1(2,44,33);
     obj.show();
    }
}
 class orange1
{
    private int hour;
    private int minute;
    private int second;

    public  orange1 (int h,int m,int s){
              this. hour=h;
              this. minute=m;
              this. second=s;

   }
   public void show(){

   System.out.printf("%02d:%02d:%02d",hour,minute,second);
   }
}