package ch02;

public class Oper2 {
	public static void main(String[] args) {
		int i1 = 7, i2 = 8, i3 = 6;
		float f1 = 3.7254f;
		boolean b1 = i1 > 12;
		boolean b2 = i2 > i3;
		int i4 = (int)f1;
		String s1 =" "+ 2 + 0 + 2 + 1 + "대박";
		System.out.println("b1 = "+b1); // false
		System.out.println("b2 = "+b2); // true
		System.out.println("i4 = "+i4); // 3
		System.out.println("s1 = "+s1); // 5대박
		
	}
}
