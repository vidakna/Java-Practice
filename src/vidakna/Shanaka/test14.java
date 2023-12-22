package vidakna.Shanaka;

public class test14 {
    public static void main(String[] args) {
         static59 member1=new static59("Shanaka","Wijerathne");
         static59 member2=new static59("Mia","khalifa");
         static59 member3=new static59("Dani","Daniels");

         System.out.println("\n-------------------------------------------------------------\n\n");

         System.out.println(member2.getfname());
         System.out.println(member2.getlname());
         System.out.println(static59.getmembers());

        
     }    
    }
    
 class static59 {
    
    private String fname;
    private String lname;
    
    private static int members=0;
    
    static59(String fn,String ln){
        fname=fn;
        lname=ln;
        members++;
        System.out.printf("%s %s member in the library : %d \n",fname,lname,members);
    }

  public String getfname() 
    {
        return fname;    
    }

    public String getlname() 
    {
        return lname;    
    }

    public static int getmembers() 
    {
        return members;    
    }
}