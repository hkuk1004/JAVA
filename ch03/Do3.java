package ch03;
import java.io.IOException;

public class Do3 {
	public static void main(String[] args) throws IOException {
		// ¦���� �Է��ϼ��� do~while����ϸ� ���ϴ� ¦���� ���� �� ���� �ݺ���ų �� ����

		int num = 0; // ���⿡ �����ϸ� main�޼��� �������� ���
		do { // 7 + enter, enter => \r\n -> CR(������ ����), LF(�� �ٲ��)
			// CR�� 13, LF�� 10
			System.out.println("�� �ڸ� ¦���� �Է��ϼ���");
			//num�� �������� do { ���� } ���� ��������
			num = System.in.read() - '0';
			System.in.read(); // CR \r ó��
			System.in.read(); // LF \nó��
		}while(num % 2 == 1);
		System.out.println("�Է��� ¦�� : " + num);
	}
}
