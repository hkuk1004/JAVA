package ch07;

public class Animal {
	int x = 7;
	void move() {
		System.out.println("움직인다");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("부리로 쪼아 먹는다");
	}
	void move() {
		System.out.println("날개로 난다");
	}	
}
class Fish extends Animal{
	void move() {
		System.out.println("지느러미로 헤엄친다");
	}
}
class Pig extends Animal{
	int x = 10;
	void move() {
		System.out.println("네발로 움직인다");
	}
}