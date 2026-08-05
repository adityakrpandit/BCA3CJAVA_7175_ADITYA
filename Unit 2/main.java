// Write a java program to perform simple inheritance.... 

class Animal{
    String name = "Animal";
    void eat(){
        System.err.println("This animal eats food.");
    }
}

// Subclass (child) inheriting Animal
class Dog extends  Animal{
    void bark(){
        System.err.println("The dog barks: Woof! Woof!");
    }
}

// main Execution class
public class main{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method from Animal class!
        myDog.bark(); // Own method of Dog class
    }
}