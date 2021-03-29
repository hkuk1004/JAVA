package ch05;

public class Car2 {
	String color = "검정"; // 값을 대입하지 않으면 이것을 사용, default값
	int displacement = 1000;
	String name = "BMW";
	void print() {
		System.out.println("차 종류 : " + name);
		System.out.println("배기량 : " + displacement);
		System.out.print("차 색상 : " + color);
		System.out.println("===================================");
	}
}
