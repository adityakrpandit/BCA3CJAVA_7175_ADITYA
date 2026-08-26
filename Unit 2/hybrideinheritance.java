class animal{

    void eat()
    {
        System.out.println("Animal is eating food..");
    }
}

class dog extends animal{

    void maikesound()
    {
        System.out.println("The dog bark: Woof!.. Woof!...");
    }
}

interface petanimal{

    void drink();

}

class puppy extends dog implements petanimal{

    public void drink(){
        System.out.println("Puppy is drinking water.");
    }
}

public class hybrideinheritance {
    
    public static void main(String[] args) {
        
        puppy p = new puppy();
        p.eat();
        p.maikesound();
        p.drink();
    }   
}
