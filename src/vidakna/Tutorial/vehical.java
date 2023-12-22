package Tutorial;

 public  class vehical {
   
     String brand="ford";
      

    

    public static void Honk(){

        System.out.println("tutt,tut");
    }
}
  class car extends vehical {
    public static void main(String[] args) {
        car c=new car();
        c.Honk();
        String model="Mustang";
        
        System.out.println(c.brand+" "+model);
    }
   
}
