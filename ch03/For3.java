package ch03;

public class For3 {
	public static void main(String[] args) {
	//1 ~ 100 까지 : 짝수합, 홀수합, 전체합
		int evenSum = 0, oddSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 0) evenSum += i;
			else oddSum += i;
		}
		System.out.println("짝수합계 : " + evenSum);
		System.out.println("홀수합계 : " + oddSum);
		System.out.println("전체합계 : " + (evenSum+oddSum));
}
}
