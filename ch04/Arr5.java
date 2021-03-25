package ch04;

public class Arr5 {
	public static void main(String[] args) {
		// 문자배열 fruit = 산딸기, 판딸기, 집딸기, 죽은딸기, 알카리딸기
		// 문자열 배열에 넣고 일반 for와 확장 for을 사용하여 각각 출력
		String[] fruits = {"산딸기","판딸기","집딸기","죽은딸기","알카리딸기"};
		for (int i=0; i<=fruits.length; i++) {
			System.out.println("fruits[" + i+ "] = " + fruits[i]);
		}
		System.out.println("=================================");
		for(String str : fruits) { //앞 데이터부터 하나씩 가지고 와서 처리
			System.out.println(str);
		}
		int[] arrs = {89,65,97,77,94};
		int sum1 = 0, sum2 = 0;
		for(int i=0; i<arrs.length; i++) {
			sum1 += arrs[i];
		}
		for(int ar : arrs) {
			sum2 += ar;
		}
		System.out.println("합계 : " + sum1);
		System.out.println("합계 : " + sum2);
		// 합계를 확장 for와 일반 for을 사용하여 각각 출력
	}
}
