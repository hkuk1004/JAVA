package ch04;

public class Arr4 {
	public static void main(String[] args) {
		//int[] a = {34,78,99,56,66};
		int[] a = {34, 78, 99, 56, 66}; // 정수 배열 5개 생성
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("============================");
		
		// 배열에서 하나씩 추출하여 변수에 넣고 변수 값을 출력
		for(int i : a) {
			System.out.println(a[i]);
		}
	}
}
