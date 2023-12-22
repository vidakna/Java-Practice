package Tutorial;

public class Student {
    int ID;
    String Name;
    int Age;

    public Student (int i, String n, int a){
        ID = i;
        Name = n;
        Age = a;
    }

    void display() {
        System.out.println(ID + " " + Name + " " + Age);
    }

    public static void main(String[] args){
        //create Object and Passing to Values.
        Student s1 = new Student(01,"Himesh", 24);
        Student s2 = new Student(02, "Chandima", 24);

        s1.display();
        s2.display();
    }
}
