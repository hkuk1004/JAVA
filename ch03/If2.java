package ch03;

public class If2 {
	public static void main(String[] args) {
		//int i1 = 10;
		// Integer.parseInt�� args[0]�� �ִ� ���ڸ� ������ �ٲ��
		 int i1 = Integer.parseInt(args[0]);
		// i1�� 0���� ũ�� ����Դϴ�
		// ���ڴ� i1�Դϴ�
		// i1�� 0���� �۰ų� ������
		// ���� �Դϴ�
		// ���밪�� -i1�Դϴ�.
		if(i1 > 0) {
			System.out.println("���ڴ� " + i1 + "�Դϴ�.");
			System.out.println("i1�� ����Դϴ�. ");
		}else {
			System.out.println("�����Դϴ�.");
			System.out.println("���밪�� " + -i1 + "�Դϴ�.");
		}
	}
}
