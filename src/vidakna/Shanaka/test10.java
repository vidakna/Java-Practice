package vidakna.Shanaka;

public class test10 {
    public static void main(String[] args) {
        orange orangeObj = new orange();
       // System.out.println(orangeObj.standerdTime());
      //  System.out.println(orangeObj.regularTime());

       orangeObj.setTime(16,50,59);
        System.out.println(orangeObj.standerdTime());
        System.out.println(orangeObj.regularTime());

      //  orangeObj.setTime(15,13,07);
       // System.out.println(orangeObj.standerdTime());

       // orangeObj.setTime(30,-1,59);
       // System.out.println(orangeObj.standerdTime());
       
    }
}
 class orange 
{
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int m, int s) 
    {
        hour = ((h>=0 && h<24)? h:0);
        minute = ((m>=0 && m<60)? m:0);
        second = ((s>=0 && s<60)? s:0);
    }
    
    public String standerdTime()
    {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    public String regularTime()
    {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12)? 12:hour %12),minute,second,(hour<12 ? "AM":"PM"));
    }

    public Object getDesc() {
        return null;
    }

    public static orange[] values() {
        return null;
    }
}