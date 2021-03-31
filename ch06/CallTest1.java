package ch06;
class E1{
	int x,y;
	void m1(int a1, int a2) {
		// 각각 10씩 증가후 출력
		a1 += 10; a2 += 10;
		System.out.println("x = " + a1);
		System.out.println("y = " + a2);
	}
	void m2(E1 e) {
		// e의 x,y에 10증가 후 출력
		e.x += 10; e.y += 10;
		System.out.println("e1.x = "+ e.x);
		System.out.println("e1.y = "+ e.y);
	}
}
public class CallTest1 {
	public static void main(String[] args) {
		int x = 8, y = 12;
		E1 e1 = new E1();
		e1.m1(x, y); // callByValue 값을 전달하므로 변수는 서도 다른 변수로 생각한다
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		e1.x = 8; e1.y = 12;
		e1.m2(e1); // callByReference는 주소를 전달하므로 주소에 있는 실제 값은 같이 변경
		System.out.println("e1.x = " + e1.x);
		System.out.println("e1.y = " + e1.y);
		// m1 호출하고 x,y 출력
		//E1 e 객체 생성하고 객체의 x,y에 8과 12대입하고
		// e 객체의 x,y 출력 
	}
}
