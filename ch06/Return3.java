package ch06;

public class Return3 {
	public static void main(String[] args) {
// 		call(�̸� ����)
		Return3 r = new Return3();
		String[] name = {"����","����","��","����"};
		for (String n : name) {
			// String msg = Return3.call(n);
			String msg = r.call(n);
			System.out.println(msg);
		}
	}
	// �̸� + �� �ȳ��ϼ��� ���� return
	String call(String n) {
		return n + "�� �ȳ��ϼ���";
	}
	

}