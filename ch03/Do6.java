package ch03;

import java.io.IOException;

public class Do6 {
	public static void main(String[] args) throws IOException {
		// ������ ���ڸ� �Է� �޴µ� 0�̸� ����,
		// 2 ~ 9 �� ������, 1�̸� ������ ���ڰ� �ƴմϴ�.
		// ��� ���� �ݺ��ؼ� ������ ���� �Է��϶�� ��û.
		int num = 0, i = 1;
		do {
			System.out.println("������� ������ :");
			num = System.in.read() - '0';
			System.in.read(); // CR ó��
			System.in.read(); // LF ó��
			if(num == 1) System.out.println("������ ���ڰ� �ƴմϴ�.");
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
