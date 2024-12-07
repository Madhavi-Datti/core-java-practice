package polymorphism;
class Animal {
 void makeSound() {
     System.out.println("Some animal sounds");
 }
}

class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Bow! Bow!");
 }
}

class Bird extends Animal {
 @Override
 void makeSound() {
     System.out.println("Tweet! Tweet!");
 }
 }


public class RunTimePolymorphism {
	// Method to demonstrate runtime polymorphism
	public static void animalSound(Animal animal) {
	    animal.makeSound();
	}
	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.makeSound();
		Animal obj1 = new Bird();
		obj1.makeSound();
		

	}

}



