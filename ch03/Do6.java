package ch03;

import java.io.IOException;

public class Do6 {
	public static void main(String[] args) throws IOException {
		// 구구단 숫자를 입력 받는데 0이면 종료,
		// 2 ~ 9 면 구구단, 1이면 구구단 숫자가 아닙니다.
		// 계산 실행 반복해서 구구단 숫자 입력하라고 요청.
		int num = 0, i = 1;
		do {
			System.out.println("보고싶은 구구단 :");
			num = System.in.read() - '0';
			System.in.read(); // CR 처리
			System.in.read(); // LF 처리
			if(num == 1) System.out.println("구구단 숫자가 아닙니다.");
			else if(num >= 2 && num <= 9) { 
				do {
					System.out.printf("%d * %d = %d\n",num, i, num*i);
					i++;
				}while(i<=9);
				i = 1;
			}
		}while(num != 0);
		System.out.println();
	}
}
