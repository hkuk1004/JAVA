package ch05;
class Cal{
	int x = 0, y = 0; // �������, �������� Ŭ���� �ؿ� �ְ� ���� �޼��忡�� ��� ����
	public void cal() {
		String title = "=== ������ ==="; //�������� : �޼��� ������ �����ϰ� �� �ȿ��� ���
		System.out.println(title);
		System.out.println("���� : "+ (x+y));
		System.out.println("���� : "+ (x-y));
		System.out.println("���� : "+ (x*y));
		System.out.println("������ : "+ (x/y));
	}
}

public class CalEx { // Ŭ������ ������ ����� ��� public �� 1����
	// main �޼��尡 �ִ� ���� main �޼��尡 �ִ� Ŭ������ public/ Ŭ�������� ���ϸ�� ��ġ�ؾ��Ѵ�
	public static void main(String[] args) {
//		String str = "�����"; // ��������
//		x = 10; // ���๮�� ���������� ����ϱ� ���ؼ� ��ü�� �����ؾ� ��
		Cal c1 = new Cal();
		c1.x = 10;
		c1.y = 4;
		Cal c2 = new Cal();
		c2.x = 12;
		c2.y = 3;
//		c1.title = "���"; // title�� ���������� ��� �Ұ���
		c1.cal();
		c2.cal();
	}
}
