package ch02;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "�浿";
		String greeting = "�ȳ�"; // '�ȳ�'; ���� ����ǥ�� ����
		String a = name + greeting; // ���ڿ��� ���� ����
		System.out.println("a = " + a);
		// 0 1 2 3 : index
		// �� �� �� �� // substring : ������ �Ϻ� ���� -> �͵��� 1���� 2��
		System.out.println(a.substring(1,2));
		// substring : ������ �Ϻ� ���� -> �ε��� 0���� 3��
		System.out.println(a.substring(0,3));
		// ���ڿ����� ������ �ϴ� �񱳴� equals
		System.out.println(name.equals(greeting));
	}

}
