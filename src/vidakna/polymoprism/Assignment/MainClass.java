package Assignment;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String name;
		String color;
		int engineCapacity;
		String bodyType;
		
		System.out.println("Name");
		name = s.nextLine();
		
		System.out.println("Color");
		color = s.nextLine();
		
		System.out.println("Engine Capacity");
		engineCapacity = s.nextInt();
		
		System.out.println("Body Type");
		bodyType = s.nextLine();
		
		Car c1 = new Car();
		c1.input(name, color, engineCapacity, bodyType);
		
		c1.display();
		
	}
}


class Car{
	
	private String name;
	private String color;
	private int engineCapacity;
	private String bodyType;
	
	
	public void input(String name, String color, int engineCapacity, String bodyType) {
		this.name = name;
		this.color = color;
		this.engineCapacity = engineCapacity;
		this.bodyType = bodyType;
	}
	
	public double cost() {
		return   3000 * engineCapacity;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Color : " + color);
		System.out.println("Engine Capacity : " + engineCapacity);
		System.out.println("Body Type : " + bodyType);
		System.out.println("cost: " + cost());
	}
	
}