package ch07;

class Ambulance3 extends Car3{
	String color = "�ʷ�";
	void drive() {
		System.out.println("ȯ�ڸ� �ư� �޸���");
	}
}
class Bus3 extends Car3{
	void drive() {
		System.out.println("45����� �ư� �޸���");
	}
}
public class Car3 {
	String color = "�Ķ�";
	void drive() {
		System.out.println("�ų��� �޸���");
	}
}
class FireEngine3 extends Car3{
	String color = "����";
	void drive() {
		System.out.println("���� �ư� �޸���");
	}
	void fire() {
		System.out.println("�Ҳ��� ���� ����");
	}
}