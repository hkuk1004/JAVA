package ch04;

public class SecArr2 {
	public static void main(String[] args) {
		double[][] amount = { {23.45, 56.76, 12.34}, {56.12, 89.35, 78.99}};
		// �հ�, �࿭�� ���� ���
		double sum = 0.0;
		for (int i=0; i<amount.length; i++) {
			for (int j=0; j<amount[i].length; j++) {
				System.out.print(amount[i][j] + "\t");
				sum += amount[i][j];
			}
			System.out.printf("�� : %.2f\n ",sum);
			sum = 0.0;
		}
		for(double[] amt : amount) {
			for(double at : amt) {
				System.out.print(at + "\t");
				sum += at;
			}
			System.out.printf("�հ� : %.2f\n", sum);
			sum = 0.0;
		}
	}
}
