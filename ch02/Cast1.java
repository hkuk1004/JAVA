package ch02;

public class Cast1 {
	public static void main(String[] args) {
		byte b1 = 25;
		int i1 = b1;
		int i2 = 70;
		byte b2 = (byte)i2;
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
	}
}
