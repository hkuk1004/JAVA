package ch02;
public class OpSp3 {
	public static void main(String[] args) {
		long l1 = 1000000 * 1000000L;
		System.out.println("l1 = " + l1);
		// ���ϱ� �� ����� int�� ������ ����� ������ ������ ��
		int i1 = 1000000 * 1000000 / 1000000;
		System.out.println("i1 = " + i1);
		int i2 = 1000000 / 1000000 * 1000000;
		System.out.println("i2 = " + i2);
	}
}