package ch07;

public class Animal {
	int x = 7;
	void move() {
		System.out.println("�����δ�");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("�θ��� �ɾ� �Դ´�");
	}
	void move() {
		System.out.println("������ ����");
	}	
}
class Fish extends Animal{
	void move() {
		System.out.println("�������̷� ���ģ��");
	}
}
class Pig extends Animal{
	int x = 10;
	void move() {
		System.out.println("�׹߷� �����δ�");
	}
}