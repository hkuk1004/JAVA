package ch02;

public class Cast2 {
	public static void main(String[] args) {
		float f1 = 3.15f;
		int i1 = (int)f1; // �Ҽ����� ����
		System.out.println("i1 = " +i1);
		// ������ ��� ���� ���� ����ȯ�� �ϸ� ���� �����Ⱚ�� ��
		byte b1 = (byte)128; // -128 ~ 127
		byte b2 = (byte)256;
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
	}
}
