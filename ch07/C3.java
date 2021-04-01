package ch07;

public class C3 extends C2 { // subtype, child
	int c3 = 77;
	C3() {
		System.out.println("내가 자식 생성자");
	}
	void c31( ) {
		System.out.println("난 자식 메서드");
	}
}