package polymoprism;

public class poly {
public static void main(String[] args) {
    shape[] shape=new shape[2];

    shape[0] =new rectangle(10,20);

    shape[1] =new circle(10);

    System.out.println("Area of the circle "+shape[1].getArea());
    System.out.println("Area of the rectangle "+shape[0].getArea());
}
   
}
 class rectangle extends shape{
    private double width;
    private double length;

    public rectangle(double w,double l){

        this.width=w;
        this.length=l;
    }

        public double getArea() {
            
        return this.width * this.length;
       }
}
    class circle extends shape{
       private double radius;

    public circle(double r){
        this.radius=r;
    }
    public double getArea(){

        return 3.14*this.radius*this.radius ;
    }
   } 
    class  shape{
    
        public double getArea(){

            return 0;
           }
        
        
    }


