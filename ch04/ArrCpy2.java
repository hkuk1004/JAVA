package ch04;

public class ArrCpy2 {
	public static void main(String[] args) {
		int[] arr1 = {34,56,67,88, 92};
		// 0  1  2  3  4  5  6  7  8  9 
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // �� ��쿡�� �ּҸ� �� �� �ƴ϶� �����͸� �� ��
		arr1[0] = 77; // �׷��� arr1�� [0] ���� 77�� �ٲ��, arr2[0] �� ���� arr1[0] ���� 34����
		for(int ar : arr1) {
			System.out.print(ar + "\t");
		}
		System.out.println();
		for(int ar : arr2) {
			System.out.print(ar + "\t");
		}
		System.out.println();
		int[] arr3 = new int[10];
		System.arraycopy(arr1, 0, arr3, 3, arr1.length);
		for(int ar : arr3) {
			System.out.print(ar + "\t");
		}
		System.out.println();
		
		int[] arr4 = new int[10];
		System.arraycopy(arr1, 2, arr4, 3, 3); // ���⼭ ������ 3�� arr1.length�� �������� ������ �ִ� ���� 5������ �۱� ������
		// �ִ� �迭�� �ֱ� �����ϴ� ��ġ // ������ �����ϴ� ����
		for(int ar : arr4) {
			System.out.print(ar+"\t");
		}
	}
}
