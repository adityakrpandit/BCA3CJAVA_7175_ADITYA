class animal{

    void eat(){
        System.out.println("animal is eating ");
    }
}

class dog extends animal{
    
    void bark(){
        System.out.println("the dog woof!.. woof!...");
    }
}

class puppy extends dog{

    void cry(){
        System.out.println("puppy is crying");
    }
}

public class finalclass{

    public static void main(String[] args) {
        
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.cry();

    }
}

