package ch05;

public class Car { // 클래스 헤더, 선언부
	String color; // 멤버변수, 필드, 속성
	int displacement;
	String name;
	void speedUp() { // void(반환형) 메서드명() -> 메서드 헤더, 메서드 선언부
		System.out.println("속도를 내고 달린다"); // 구현부 / 실행부
	}
	void stop() {
		System.out.println("차를 멈춘다");
	}
}
