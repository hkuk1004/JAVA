package ch02;

public class Bit1 {
	public static void main(String[] args) {
		int num1 = 10; // 0000000000001010 
		int	num2 = 6; // 0000000000000110
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 & num2 = " + (num1&num2));
		System.out.println("num1 | num2 = " + (num1|num2));
		System.out.println("num1 ^ num2 = " + (num1^num2));
	}
}
