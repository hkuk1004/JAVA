package ch03;
import java.io.IOException;
public class IO1 {
	public static void main(String[] args) throws IOException{
		System.out.println("���� ���ڸ��� �Է��ϼ���: ");
		// �ֿܼ� �Է��� ���ڸ� ���ڸ� �д´�
		int num = System.in.read() - 48; // -48 �ϴ� ������ �ƽ�Ű�ڵ� ������
		// int num = System.int.read() - '0'; //�̷��� �ص� ��.
		System.out.println("�Է��� ���� : " + num);
	}
}
