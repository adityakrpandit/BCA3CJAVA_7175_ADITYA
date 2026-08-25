
interface animal{

    void makesound();
    void eat();

}

class dog implements animal{

    public void makesound()
    {
        System.out.println("Woof!..");
    }

    public void eat()
    {
        System.out.println("Dog is eating cat food.");
    }
}

class cat implements animal{

    public void makesound()
    {
        System.out.println("Meow!..");
    }

    public void eat()
    {
        System.out.println("Cat is eating cat food..");
    }
}


public class interfaceEx{

    public static void main(String[] args) {
        
        animal mydog = new dog();
        animal mycat = new cat();

        System.out.println("Dog:");
        mydog.makesound();
        mydog.eat();
        
        System.out.println("\nCat:");
        mycat.makesound();
        mycat.eat();

    }
}