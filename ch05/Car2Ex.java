package ch05;

public class Car2Ex {
	public static void main(String[] args) {
		// 클래스 객체(레퍼런스)명
		Car2 car1 = new Car2();
		Car2 car2 = new Car2();
		car1.name = "소나타";
		car1.displacement = 1500;
		car2.name = "페라리";
		car2.displacement = 2800;
		car2.color = "빨강";
		System.out.println("car1 의 이름 : "+ car1.name);
		System.out.println("car1 의 색상 : "+ car1.color);
		System.out.println("car1 의 배기량 : "+ car1.displacement);
		System.out.println("car2의 이름 : "+car2.name);
		System.out.println("car2의 색상 : "+car2.color);
		System.out.println("car2의 배기량 : "+car2.displacement);
	}
}
