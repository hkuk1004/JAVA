package ch06;
class Car{
	String kind;
	int displacement;
	String color;
	// 외부에서 kind, 배기량, 색을 받아서 멤버변수에 저장 this사용하여 생성자
	// print( ) { // 종류, 배기량, 색
	public Car(String kind, int displacement, String color) {
		this.kind = kind; this.displacement = displacement; this.color = color;
	}
	void print() {
		System.out.println("=================");
		System.out.println("종류 : "+kind);
		System.out.println("배기량 : "+displacement);
		System.out.println("색깔 : "+this.color);
	}
}
public class CarEx {
	public static void main(String[] args) {
//		Car c1, c2, c3 생성하고 출력
		Car car1 = new Car("소나타",1500,"빨강");
		Car car2 = new Car("벤츠", 2000, "초록");
		Car car3 = new Car("모닝", 1200, "노랑");
		car1.print(); car2.print(); car3.print();
	}
}
