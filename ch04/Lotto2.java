package ch04;

import java.util.Scanner;

public class Lotto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �����
		int temp = 0;
		// 1 ~ 45 ������ ��
		int[] lotto = new int[6];
		System.out.println("�� ���� ���� ��ų��� ?");
		int num = sc.nextInt();
		for (int i=0; i<num; i++) {
			System.out.println("�ζ� ���ϴ� ��ȣ�� �Է��ϼ���");
			lotto[i] = sc.nextInt();
		}
		
		for(int i=1; i<lotto.length; i++) {
			//   0 ~ 44  0.0001~44.9999
			lotto[i] = (int)(Math.random()*45) + 1;
			// �տ� �����Ϳ� ���ؼ� ������ �ٽ� ���� ����
			for(int j=i-1; j >= 0; j--) { // �ε��� 0������ �� ��
				if(lotto[j] == lotto[i]) {
					i--; // ���� �ε����� ���ư��� �ٽ� ����
					break; 
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		// �ߺ��� �ִ� for��
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
