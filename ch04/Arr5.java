package ch04;

public class Arr5 {
	public static void main(String[] args) {
		// ���ڹ迭 fruit = �����, �ǵ���, ������, ��������, ��ī������
		// ���ڿ� �迭�� �ְ� �Ϲ� for�� Ȯ�� for�� ����Ͽ� ���� ���
		String[] fruits = {"�����","�ǵ���","������","��������","��ī������"};
		for (int i=0; i<=fruits.length; i++) {
			System.out.println("fruits[" + i+ "] = " + fruits[i]);
		}
		System.out.println("=================================");
		for(String str : fruits) { //�� �����ͺ��� �ϳ��� ������ �ͼ� ó��
			System.out.println(str);
		}
		int[] arrs = {89,65,97,77,94};
		int sum1 = 0, sum2 = 0;
		for(int i=0; i<arrs.length; i++) {
			sum1 += arrs[i];
		}
		for(int ar : arrs) {
			sum2 += ar;
		}
		System.out.println("�հ� : " + sum1);
		System.out.println("�հ� : " + sum2);
		// �հ踦 Ȯ�� for�� �Ϲ� for�� ����Ͽ� ���� ���
	}
}
