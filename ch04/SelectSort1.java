package ch04;

public class SelectSort1 {
	public static void main(String[] args) {
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		int temp;
		for (int i=0; i<score.length; i++) {
			for (int j= i+1; j<score.length; j++) {
//				if(score[i] > score[j]) { // ���� ���̸� ��ȯ
				if(score[i] < score[j]) { // ū���̸� ��ȯ
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		/*for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + "\t");
		}*/
		for(int i : score) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
}
