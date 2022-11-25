public class Main {
	public static void main(String[] args) {
		Animal[] animals = {new Cat(), new Dog(), new Cow()};
		
		Main.voiceAnimal(animals);
	}
	
	static void voiceAnimal(Animal[] animals) {
		for (Animal animal : animals) {
			animal.sound();
		}
	}
}

class Animal {
	void sound() {
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("woof");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("meow");
	}
}

class Cow extends Animal {
	@Override
	void sound() {
		System.out.println("moo");
	}
}