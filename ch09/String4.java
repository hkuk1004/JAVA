package ch09;

public class String4 {
	public static void main(String[] args) {
		String str = "�츮�� ģ������, �翡������ ����� ģ��";
		// �ε��� 5���� 10�� �տ����� ���
		System.out.println(str.substring(5,10));
		// ����(" ")�����Ͽ� �迭 strs�� ����� �迭 ������ ���
		System.out.println("==========");
		String[] strs = str.split(" ");
		for (String st : strs) {
			System.out.println(st);
			// �迭 �������߿��� ������ ������ �ܾ� ���
			if(st.endsWith("��")) System.out.println("������ �� : "+st);
			//	      "        ������ �����ϴ�  "
			if(st.endsWith("��")) System.out.println("������ ���� : "+st);	
		}
		System.out.println("==========");
		// ���� ����� ���
		// ��ģ �ѵ�� ��~          �̷�
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i)); // �ش��ϴ� �ε��� �� ���� ����
		}
	}
}
