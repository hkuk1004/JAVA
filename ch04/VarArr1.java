package ch04;

public class VarArr1 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] score = {{67,89,98,88}, {56,78}, {67,89,99}, {34,67,78,99,100}};
		for (int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println("�հ� : " + sum);
			sum = 0;
		}
	}
}
