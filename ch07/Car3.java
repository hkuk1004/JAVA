package ch07;

class Ambulance3 extends Car3{
	String color = "초록";
	void drive() {
		System.out.println("환자를 싣고 달린다");
	}
}
class Bus3 extends Car3{
	void drive() {
		System.out.println("45명까지 싣고 달린다");
	}
}
public class Car3 {
	String color = "파랑";
	void drive() {
		System.out.println("신나게 달린다");
	}
}
class FireEngine3 extends Car3{
	String color = "빨강";
	void drive() {
		System.out.println("물을 싣고 달린다");
	}
	void fire() {
		System.out.println("불끄러 가는 차다");
	}
}