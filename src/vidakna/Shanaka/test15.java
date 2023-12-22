package vidakna.Shanaka;
 
public class test15 {
    public static void main(String[] args){

        constantNum obj = new constantNum(5);
        obj.add();
        System.out.println(obj.getString());

        constantNum obj1 = new constantNum(15);
        obj1.add();
        System.out.println(obj1.getString());

        constantNum obj2 = new constantNum(25);
        obj2.add();
        System.out.println(obj2.getString());
    }
}
 class constantNum {

    private  int ans;
    private  final int Number;

    constantNum(int x){
        Number = x;
    }
  
    public void add(){
        ans = Number + 10;
    }

    public String getString(){
        return String.format("Answer is = %s", ans);
    }
}
