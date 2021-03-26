package ch04;

public class ArrCpy2 {
	public static void main(String[] args) {
		int[] arr1 = {34,56,67,88, 92};
		// 0  1  2  3  4  5  6  7  8  9 
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // 이 경우에는 주소를 준 게 아니라 데이터를 준 것
		arr1[0] = 77; // 그래서 arr1의 [0] 값이 77로 바뀌되, arr2[0] 은 원래 arr1[0] 값인 34유지
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
		System.arraycopy(arr1, 2, arr4, 3, 3); // 여기서 마지막 3을 arr1.length로 주지않은 이유는 주는 값이 5개보다 작기 때문에
		// 주는 배열의 주기 시작하는 위치 // 데이터 전달하는 개수
		for(int ar : arr4) {
			System.out.print(ar+"\t");
		}
	}
}
