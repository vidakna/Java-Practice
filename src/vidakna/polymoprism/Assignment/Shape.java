package Assignment;
import java.util.Scanner;
class Shape {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double length=in.nextDouble();
        double width=in.nextDouble();
        double radius=in.nextDouble();
    }
	
	protected int radius;
	protected int length;
	protected int width;
	
	public void input(int radius, int length, int width) {
		this.radius = radius;
		this.length = length;
		this.width = width;
	}
	
	public void area(int length , int width) {
		System.out.println("Area of the Rectangle : " + (length * width));
	}
	
	public void area(int radius) {
		System.out.println("Area of the circle: " + (3.14 * Math.pow(radius, 2)));
	}
	
}


class Circle extends Shape{
	
}

class Rectangle extends Shape{
	
}