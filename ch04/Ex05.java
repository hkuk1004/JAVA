package ch04;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// Scanner�� �̿��Ͽ� �⵵ 4�󸮸� �޾Ƽ� ���� �Ǵ� ��� �Ǵ�
		// ���� : 4�� ������ �������� 100���� �� �������� �⵵, 400���� ������ �������� �⵵
		// 2100x, 2104 o, 2000 o
		// �⵵�� 0�̸� �����ϰ� 0�� �ƴϸ� ��� ����
		Scanner sc = new Scanner(System.in);
		int year = 0;
		do {
			System.out.println("4�ڸ� ������ �Է��ϼ��� :");
			year = sc.nextInt();
			if(year % 4 == 0 && year % 100 != 0  || year % 400 == 0) {
				System.out.println(year+"�� �����Դϴ�.");
			}else {
				System.out.println(year+"�� ����Դϴ�.");
			}
		}while(year != 0);
		sc.close();
		System.out.println("���α׷� ����");
	}
}
