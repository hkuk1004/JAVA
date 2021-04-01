package ch07;

public class C2 extends C1 { // supertype(subtype), parent(child)
	int c2 = 56;
	C2() {
		System.out.println("내가 아버지 생성자");
	}
	private void c21( ) {
		System.out.println("난 아버지 메서드");
	}
}