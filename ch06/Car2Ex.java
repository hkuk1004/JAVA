package ch06;
class Car2 {
	Car2() { // 1
		this("BMW"); // 2
		System.out.println("�Ű������� ���� ����");
		// �Ű������� ���� ����
		
	}
	Car2(String name){ // 3
		this(name, "���"); // 4
		System.out.println("�Ű������� ���� ������ : "+name); // 7
		// �Ű����� �ϳ� �̸�
		
	}
	Car2(String name, String color){ // 5
		System.out.println("�Ű������� ���� ������ : "+name+", ���� : " + color); // 6
		// �Ű�����2, �̸�, ����
		
	}
}
public class Car2Ex {
	public static void main(String[] args) {
		Car2 c = new Car2();
	}
}
