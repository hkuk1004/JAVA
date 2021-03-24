package ch02;

public class Ch02Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123;
		int sizeOfBucket = 10;
		// 바구니의 크기(바구니에 담을 수 있는 사과의 갯수)
		//int numOfBucket = numOfApples - (numOfApples % sizeOfBucket);
		int numOfBucket = numOfApples % sizeOfBucket == 0 ?
				numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;
		System.out.println("바구니에 담을 수 있는 사과의 갯수 : " + numOfBucket);
	}

}
