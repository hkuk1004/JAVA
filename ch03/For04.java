package ch03;

import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		//Scanner 숫자를 받아서 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 숫자를 입력하세요");
		int num = sc.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",num,i,num*i);
		}
		sc.close();
	}
}
