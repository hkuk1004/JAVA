package ch09;

public class Math2 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		// 1 ~ 100 ���� ���� 0 <= num < 100�� �Ǽ� => 0 ~ 99 => 1 ~ 100
		int num = (int)(Math.random() * 100);
		System.out.println(num);
		System.out.println(Math.sqrt(num)); // root
		System.out.println(Math.pow(2,3)); // 2^3 => 2 * 2 * 2 
		}
}
