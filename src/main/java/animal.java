public class Main {
	public static void main(String[] args) {
		new Dog("red");
		new Cat("black");
	}
}

class Animal {
	protected Animal() {
		System.out.println("I’m an animal.");
	}
}
	
class Dog extends Animal {
	private Dog() {
		System.out.println("I’m a dog.");
	}
	
	public Dog(String color) {
		this();
		System.out.println("I'm a " + color + " dog.");
	}
}
	
class Cat extends Animal {
	private Cat() {
		System.out.println("I’m a cat.");
	}
	
	public Cat(String color) {
		this();
		System.out.println("I'm a " + color + " cat.");
	}
}