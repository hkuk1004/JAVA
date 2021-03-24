package ch02;

public class PostfixUst {
	public static void main(String[] args) {
		int num1 = 7, num2;
		num2 = (num1--) + 5; // --가 뒤에 있으니까 연산을 먼저하고 빼서 변수에 저장
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}
