package ch03;

public class For3 {
	public static void main(String[] args) {
	//1 ~ 100 ���� : ¦����, Ȧ����, ��ü��
		int evenSum = 0, oddSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 0) evenSum += i;
			else oddSum += i;
		}
		System.out.println("¦���հ� : " + evenSum);
		System.out.println("Ȧ���հ� : " + oddSum);
		System.out.println("��ü�հ� : " + (evenSum+oddSum));
}
}
