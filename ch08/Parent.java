package ch08;
// class �տ� final �ϸ� ����� �� ����
// public final class Parent {
public class Parent {
	int a = 7;
	final int B = 8;
	void m1() {
		a = 10;
//		B = 20;
		System.out.println("���");
	}
	final void m2() {
		System.out.println("�� final");
	}
}
class Child extends Parent{
	void m1() {
		System.out.println("������ ���");
	}
}
// final�� �ִ� �޼���� ������ �� �� ����
//void m2() {
//	system.out.println("������ �ȵ�");
// }