package Inheritance;

public class Animal {
    
    public static void eat(){

        System.out.println("Animals are eating");
    }
}
 class Dog extends Animal{
    

    public static void bark(){

        System.out.println("dogs are barking");
    }
}
 class BabyDog extends Dog {
    public static void main(String[] args) {
       
        BabyDog BDobj=new BabyDog();
        BDobj.eat();
        BDobj.bark();
        BDobj.sniff();
    }
    public static void sniff(){

        System.out.println("puppies are sniffing");
    }
}
