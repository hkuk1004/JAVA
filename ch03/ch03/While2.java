package ch03;

public class While2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum += i; // sum = sum + i;
			System.out.println(i + "���� �հ� : " + sum);
			i++;
		}
		// System.out.println("�հ� : " + sum);
	}
}
