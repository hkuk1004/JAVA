package ch06;
class Car{
	String kind;
	int displacement;
	String color;
	// �ܺο��� kind, ��ⷮ, ���� �޾Ƽ� ��������� ���� this����Ͽ� ������
	// print( ) { // ����, ��ⷮ, ��
	public Car(String kind, int displacement, String color) {
		this.kind = kind; this.displacement = displacement; this.color = color;
	}
	void print() {
		System.out.println("=================");
		System.out.println("���� : "+kind);
		System.out.println("��ⷮ : "+displacement);
		System.out.println("���� : "+this.color);
	}
}
public class CarEx {
	public static void main(String[] args) {
//		Car c1, c2, c3 �����ϰ� ���
		Car car1 = new Car("�ҳ�Ÿ",1500,"����");
		Car car2 = new Car("����", 2000, "�ʷ�");
		Car car3 = new Car("���", 1200, "���");
		car1.print(); car2.print(); car3.print();
	}
}
