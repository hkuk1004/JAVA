package ch06;
class B2{
	// int �� ���� ����� ����
	// void(����ִٴ� �ǹ�) : ��ȯ�� ���� ����.
	int add(int x, int y) {
		return x + y; // ��ȯ���� int�� return���� ����� int�����Ѵ�
	}
	void minus(int x, int y) {
		System.out.printf("%d - %d = %d\n",x,y,x-y);
	}
}
public class Return1 {
	public static void main(String[] args) {
		B2 b2 = new B2();
//		b2.add(12, 3);
		System.out.println(b2.add(12, 3));
		int k = b2.add(10, 7);
		System.out.println("k = " + k);
//		System.out.println(b2.minus(12, 6)); // ����� ���� ��� ����
	}
}
