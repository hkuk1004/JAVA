package ch06;
class C1{
	public void m1(int x, int y) {
//		x+=7; // 전달된 값을 저장한 변수의 값을 변경
//		y+=7;
		// 데이터 교환
		int temp = x;
		y = x;
		y = temp;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
public class CallByValue1 {
	public static void main(String[] args) {
		C1 a1 = new C1();
		int x=10, y=20; // 데이터가 기본형인경우
		a1.m1(x, y); // a1.m1(10,20); 함수 m1을 호출할 때 값을 전달
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
