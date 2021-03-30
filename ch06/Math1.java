package ch06;
class A1{
	void disp() {
		System.out.println("대박이야");
	}
	// 접근지정자
	public void prn() {
		System.out.println("선거인가");
	}
	void add(int x, int y) {
		System.out.printf("%d + %d = %d\n", x,y,x+y);
	}
}
public class Math1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.prn();
		a1.disp();
		// 여러 번 반복되는 작업을 값을 받아서 처리
		a1.add(12, 5);
		a1.add(10, 2);
		a1.add(25, 6);
	}
}
