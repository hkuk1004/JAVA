package ch09;
public class Str4 {
	public static void main(String[] args) {
		//            0 123 4567 890 1234 5 6789 01 2 : ���ڼ��� 23
		String str = "�츮�� ģ������, �翡 ������ ����� ģ��";
		// �ε��� 5���� 10�� �տ����� ���
		System.out.println(str.substring(5, 10));
		// ����(" ")�����Ͽ� �迭 strs�� ����� �躰 ������ ���
		System.out.println("=============");
		String[] strs = str.split(" ");
		for (String st : strs) {
			System.out.println(st);
			// �迭 ������ �߿��� ������ ������ �ܾ� ���
			if (st.endsWith("��")) System.out.println("������ �� : "+st);
			//    "          ������ �����ϴ�   "
			if (st.startsWith("��")) System.out.println("������ ���� : "+st);
		}
		System.out.println("=============");		
		for (int i = str.length() - 1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}