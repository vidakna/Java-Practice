package Tutorial;

class Shape {
    protected double width;
    protected double length;
    protected double radius;
    public double getWidth() {
    return width;
    }
    public void setWidth(double width) {
    this.width = width;
    }
    public double getLength() {
    return length;
    }
    public void setLength(double length) {
    this.length = length;
    }
    public double getRadius() {
    return radius;
    }
    public void setRadius(double radius) {
    this.radius = radius;
    }
    public void cirArea() {
    double area = 3.14 * Math.pow(radius, 2);
    System.out.println("Circle Area : " + area);
    }
    public void recArea() {
    double area = width * length;
    System.out.println("Rectangle Area : " + area);
    }
    }
    class Rectangle extends Shape{
    }
    class Studentmain {
    public static void main (String [] args) {
    Rectangle rec1 = new Rectangle();
    rec1.setLength(5);
    rec1.setWidth(10);
    //calculate area
    rec1.recArea();
    }
    }
