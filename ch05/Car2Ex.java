package ch05;

public class Car2Ex {
	public static void main(String[] args) {
		// Ŭ���� ��ü(���۷���)��
		Car2 car1 = new Car2();
		Car2 car2 = new Car2();
		car1.name = "�ҳ�Ÿ";
		car1.displacement = 1500;
		car2.name = "���";
		car2.displacement = 2800;
		car2.color = "����";
		System.out.println("car1 �� �̸� : "+ car1.name);
		System.out.println("car1 �� ���� : "+ car1.color);
		System.out.println("car1 �� ��ⷮ : "+ car1.displacement);
		System.out.println("car2�� �̸� : "+car2.name);
		System.out.println("car2�� ���� : "+car2.color);
		System.out.println("car2�� ��ⷮ : "+car2.displacement);
	}
}
