package vidakna.Shanaka;

enum people{
    Rydhmi
}
public class test12 {

    enum people2{
        Janeesha,De,Silva
    }
    //constant variable
    public static final String NAME="Rydhmi Janeesha";

    public static void main(String[] args) {
        System.out.println(NAME);

        //people enum
        System.out.println(people.Rydhmi);

        // created an enum variable called p1
        people2 p1=people2.De;
        System.out.println(p1);

        //people 2
        System.out.println(people2.Janeesha);
    }
    //enum => it's a public class 
    //can't create objects
}