package ch03;

import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		//Scanner ���ڸ� �޾Ƽ� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",num,i,num*i);
		}
		sc.close();
	}
}
