package ch05;
class Car3{
	// static 정적, 클래스 변수
	// static 없으면 인스턴스 변수
	// 객체를 생성하지 않고 클래스명.변수 또는 객체 생성 한 후에 참조변수명.변수;
	//static String color;
	String color;
	int displacement;
	String kind;
	void print() {
		System.out.println("============");
		System.out.println("색깔 : "+color);
		System.out.println("배기량 : "+displacement);
		System.out.println("종류 : "+kind);
	}
}
public class Var1Ex {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3();
		Car3 c3 = new Car3();
		c1.color = "빨강"; c1.displacement = 1500; c1.kind = "페라리";
		c2.color = "파랑"; c2.displacement = 2000; c2.kind = "부가티";
		c3.color = "노랑"; c3.displacement = 3000; c3.kind = "배트맨차";
		c1.print(); c2.print(); c3.print();
	}
}
