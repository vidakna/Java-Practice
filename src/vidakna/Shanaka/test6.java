package vidakna.Shanaka;

public class test6 {
    public static void main(String[] args){

        secondMeth(5,4,1,3,7,6);

    }
    public static void secondMeth(int...number){

        double total=0;

        for (int y:number)
            total+=y;

        System.out.println(total/number.length);

    }
}
