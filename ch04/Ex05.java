package ch04;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// Scanner를 이용하여 년도 4라리를 받아서 윤년 또는 평년 판단
		// 윤년 : 4로 나누면 떨어지고 100으로 안 떨어지는 년도, 400으로 나누면 떨어지는 년도
		// 2100x, 2104 o, 2000 o
		// 년도가 0이면 종료하고 0이 아니면 계속 수행
		Scanner sc = new Scanner(System.in);
		int year = 0;
		do {
			System.out.println("4자리 연도를 입력하세요 :");
			year = sc.nextInt();
			if(year % 4 == 0 && year % 100 != 0  || year % 400 == 0) {
				System.out.println(year+"는 윤년입니다.");
			}else {
				System.out.println(year+"는 평년입니다.");
			}
		}while(year != 0);
		sc.close();
		System.out.println("프로그램 종료");
	}
}
