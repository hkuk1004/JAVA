package ch03;

public class Do2 {
	public static void main(String[] args) {
		// 1 ~ 10 ���� �� do~ while
		int sum = 0;
		int i = 1;
		do {
			sum = sum + i;
			i++;
		}while(i <= 10);
		System.out.println("�հ� : " + sum);
	} 
}
