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
	protected void sound() {
		String obj = this.toString().substring(0, 3);
		
		if (obj.equals("Dog")) {
			System.out.println("woof");
		} else if (obj.equals("Cat")) {
			System.out.println("meow");
		} else if (obj.equals("Cow")) {
			System.out.println("moo");
		}
	}
}

class Dog extends Animal {
	void woof() {
		sound();
	}
}

class Cat extends Animal {
	void meow() {
		sound();
	}
}

class Cow extends Animal {
	void moo() {
		sound();
	}
}