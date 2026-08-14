class Animal{
	
	String name = "Animal";
	void eat(){
		System.out.println("This animal eats food.");
	}
}

class dog extends Animal{
	void bark(){
		System.out.println("This dog is barking: woof! woof!");
	}
}

class cat extends Animal{
	void meow() {
		System.out.println("The cat is telling meow! meow!");
	}
}

public class prg03{

	public static void main(String[] args) {
		dog mydog = new dog();
		cat mycat = new cat();
		mydog.eat();
		mydog.bark();

		mycat.eat();
		mycat.meow();
	}
}