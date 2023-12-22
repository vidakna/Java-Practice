package vidakna.Shanaka;

public class test4 {
    
    public static void main(String[] args) 
    {
        
        int arrey [] [] = { {10,20,30,40}, {1,2,3} ,{100} };

        for (int row =0; row < arrey.length; row++)
            {
                for (int column =0; column < arrey[row].length; column++ )
                    {
                        System.out.print( arrey[row] [column]+"\t");
                    }
                    System.out.println("");
            }
    } 
}