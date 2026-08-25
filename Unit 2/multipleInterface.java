interface animal{

    void makesound();
    void run();

}

interface petanimal extends animal{

    void eat();

}

class Dog implements petanimal{

    public void makesound()
    {
        System.out.println("Woof!..");
    }

    public void run()
    {
        System.out.println("Fast....");
    }

    public void eat()
    {
        System.out.println("Dog can eat Dog Food");
    }
    
}

public class  multipleInterface{

    public static void main(String[] args) {
        petanimal Dog = new Dog();
        Dog.makesound();
        Dog.run();
        Dog.eat();
    }

}