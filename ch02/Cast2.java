package ch02;

public class Cast2 {
	public static void main(String[] args) {
		float f1 = 3.15f;
		int i1 = (int)f1; // 소숫점을 버림
		System.out.println("i1 = " +i1);
		// 범위를 벗어난 것을 강제 형변환을 하면 값은 쓰레기값이 됨
		byte b1 = (byte)128; // -128 ~ 127
		byte b2 = (byte)256;
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
	}
}
