package ch03;

public class If4 {
	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		// money�� 1000000���� ũ�� ����� Ÿ����
		// money�� 100000���� ũ�� KTX Ÿ����
		// money�� 50000���� ũ�� �ý� Ÿ����
		// money�� 10000���� ũ�� ���� Ÿ����
		// �ƴϸ� �ɾ����
		if(money > 1000000)
			System.out.println("����� Ÿ����");
		else if(money > 100000)
			System.out.println("KTX Ÿ����");
		else if(money > 50000)
			System.out.println("�ý� Ÿ����");
		else if(money > 10000)
			System.out.println("���� Ÿ����");
		else
			System.out.println("�ɾ����");
	}
}
