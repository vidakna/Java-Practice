package vidakna.Shanaka;
import java.util.EnumSet;
public class test13 {
    public static void main(String[] args) {
       /* Enum3 En=Enum3.Rydhmi;
        System.out.println(En);//print the name
        System.out.println(En.getDescription());//print the desc method
System.out.println("\n");

        Enum3 En1=Enum3.Janeesha;
        System.out.println(En1);
        System.out.println(En1.getDescription());
        
        System.out.println("\n");

        Enum3 En2=Enum3.THARANI;
        System.out.println(En2);
        System.out.printf("%s\t%s\n",En2,En2.getDescription());*/

       // for (Enum3 org : Enum3.values()){            //Shanaka, Amal, Kamal, Nimal
         //   System.out.printf("%s\t%s\n",org,org.getDescription());
       // }
       for (Enum3 org :  EnumSet.range( Enum3.Janeesha, Enum3.DE)){            
         System.out.printf("%s\t%s\n",org,org.getDescription());
    
    }

}
}
 enum Enum3 {
    Rydhmi("programmer"),
    Janeesha("Chef"),
    THARANI("Dancer"),
    DE("Singer"),
    SILVA("Painter");
    

    //can create variables under enum
    private final String DESC;//variabe name DESC,a constant variable

    //can create constructors for enum
    Enum3(String desc){
        DESC=desc;
    }

    //method under enum
    public String getDescription(){
        return DESC;
    }
 }