package ch03;

public class Ch03Test02 {
	public static void main(String[] args) {
		// 1 + (1+2) + (1+2+3) + .......+ (1+2+3+4+5+6+7+8+9+10)
		int sum = 0, totalSum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
			totalSum += sum;
			//System.out.println("sum = " + sum);
			//System.out.println("totalSum =" + totalSum);
		}
		System.out.println("누적합계 : " + totalSum);
	}
}
