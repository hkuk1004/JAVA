package ch05;
class Car3{
	// static ����, Ŭ���� ����
	// static ������ �ν��Ͻ� ����
	// ��ü�� �������� �ʰ� Ŭ������.���� �Ǵ� ��ü ���� �� �Ŀ� ����������.����;
	//static String color;
	String color;
	int displacement;
	String kind;
	void print() {
		System.out.println("============");
		System.out.println("���� : "+color);
		System.out.println("��ⷮ : "+displacement);
		System.out.println("���� : "+kind);
	}
}
public class Var1Ex {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3();
		Car3 c3 = new Car3();
		c1.color = "����"; c1.displacement = 1500; c1.kind = "���";
		c2.color = "�Ķ�"; c2.displacement = 2000; c2.kind = "�ΰ�Ƽ";
		c3.color = "���"; c3.displacement = 3000; c3.kind = "��Ʈ����";
		c1.print(); c2.print(); c3.print();
	}
}
