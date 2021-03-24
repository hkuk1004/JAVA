package ch02;

public class Ext1 {
	public static void main(String[] args) {
		System.out.println("대박\n");
		System.out.println("사건");
		System.out.println("대박\t사건");
		// \뒤에 오는 문자는 특수기호가 아니라 문자 자체
		System.out.println("대\"박");
		System.out.println("대\'박");
		System.out.println("대\\박");
	}
}
