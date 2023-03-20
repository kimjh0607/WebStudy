package quiz;

public class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}
	public static void main(String[] args) {
		Dog york = new Dog();
		york.makeSound();
	}
}
