package ch04;

public class Arr3 {
	public static void main(String[] args) {
		// ���� �迭 ar(�迭��) 5�� ����
		// �� 1~10 ������ random�� ���ڸ� �ְ� ���
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) +1;
			System.out.println("arr[" + i + "] =" + arr[i]);
		}
		System.out.println("=========================");
		// Ȯ�� for, ���������� ���
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
