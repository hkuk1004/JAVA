package ch02;

public class Ch02Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123;
		int sizeOfBucket = 10;
		// �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		//int numOfBucket = numOfApples - (numOfApples % sizeOfBucket);
		int numOfBucket = numOfApples % sizeOfBucket == 0 ?
				numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;
		System.out.println("�ٱ��Ͽ� ���� �� �ִ� ����� ���� : " + numOfBucket);
	}

}
