package ch08;
// class 앞에 final 하면 상속할 수 없다
// public final class Parent {
public class Parent {
	int a = 7;
	final int B = 8;
	void m1() {
		a = 10;
//		B = 20;
		System.out.println("대박");
	}
	final void m2() {
		System.out.println("난 final");
	}
}
class Child extends Parent{
	void m1() {
		System.out.println("재정의 대박");
	}
}
// final이 있는 메서드는 재정의 할 수 없다
//void m2() {
//	system.out.println("재정의 안됨");
// }