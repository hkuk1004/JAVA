package ch08;
interface Bird{
	void eat();
}
public class Monster extends Person2 implements Fish,Bird { // Person2 상속, Fish,Bird 구현
	public static void main(String[] args) {
		Monster mt = new Monster();
		mt.eat();
		mt.swim();
		mt.move();
	}

	public void eat() {
		System.out.println("부리로 쪼아 먹는다");
	}

	public void swim() {
		System.out.println("물속에서 장시간 헤엄친다");
	}
}
