package ch02;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "길동";
		String greeting = "안녕"; // '안녕'; 작은 따옴표는 문자
		String a = name + greeting; // 문자열의 합은 연결
		System.out.println("a = " + a);
		// 0 1 2 3 : index
		// 길 동 안 녕 // substring : 데이터 일부 추출 -> 익덱스 1부터 2앞
		System.out.println(a.substring(1,2));
		// substring : 데이터 일부 추출 -> 인덱스 0부터 3앞
		System.out.println(a.substring(0,3));
		// 문자열끼리 같은가 하는 비교는 equals
		System.out.println(name.equals(greeting));
	}

}
