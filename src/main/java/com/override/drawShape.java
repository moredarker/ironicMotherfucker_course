import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Что рисуем? \n1 - треугольник\n2 - прямоугольник");
		int shape = input.nextInt();
		
		System.out.println("Какой длины стороны?");
		int length = input.nextInt();
		input.close();
		
		switch (shape) {
			case 1:
				new Triangle(length).draw();
				break;
			case 2:
				new Rectangle(length).draw();
				break;
		}
	}
}

class Shape {
	int length;
	
	Shape (int length) {
		this.length = length;
	}
	
	void draw() {
	}
}

class Triangle extends Shape {
	//бесполезное
	//final int SIZE = 3;
	
	Triangle (int length) {
		super(length);
	}
	
	@Override
	void draw() {
		int spaces = 0;
		String betweener = " ";
		for (int i = length-1; i >= 0; i--) {
			if (i == 0) {
				betweener = "_";
			}
			String line = " ".repeat(i) + "/" + betweener.repeat(spaces) + "\\" + " ".repeat(i);
			System.out.println(line);
			spaces += 2;
		}
	}
}

class Rectangle extends Shape {
	//бесполезное
	//final int SIZE = 4;
	
	Rectangle (int length) {
		super(length);
	}
	
	@Override
	void draw() {
		int width = length + 2;
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == width - 1) {
					if (j == 0 || j == width - 1) {
						System.out.print(" ");
					} else {
						System.out.print("-");
					}
				} else if (j == 0 || j == width - 1) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
