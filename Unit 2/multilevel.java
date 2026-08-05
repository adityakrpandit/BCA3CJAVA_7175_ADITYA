// Write a java program to use multilevel inheritance. 

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

class Puppy extends Dog {
    void weep() {
        System.err.println("Puppy is Weeping..");
    }
}

// main Execution class
public class multilevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
