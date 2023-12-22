package vidakna.Shanaka;

public class Employee
{
    //Change these values and keep one value unassigned and see how constructor works
    String name="kamal";
    int age=33;
    String department;

    //Parameterized constructor that I created
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    //If you create a non parameterized constructor, also u have to create a parameterized constructor.
    //default constructor comes to play in default.
    // If there is no parameterized constructor, then default constructor comes to initialize the program
    //go to line 5 and read
    public Employee()
    {
        this.name ="Saman";
        this.age = 23;
        this.department="IT";
    }
}