package ch03;

public class Do7 {
	public static void main(String[] args) {
		// do ~ while을 이용하여 구구단 2 ~ 9단 출력
		int i = 1, j = 2;
		do {
			do {
				System.out.printf("%d * %d = %d\t",j, i, i*j);
				j++;
			}while(j<=9);
			i++;
			j = 2;
			System.out.println();
		} while(i<=9);
	}
}
