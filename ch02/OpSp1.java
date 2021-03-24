package ch02;

public class OpSp1 {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		byte b3 = (byte) (b1 + b2); // 연산할 때는 b1과 b2가 int형으로 변형
		int b4 = b1 + b2;
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
	}
}