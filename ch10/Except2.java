package ch10;
import java.util.Scanner;
public class Except2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2 = 0;
		while(true) {
			System.out.println("첫 번째 숫자를 입력하세요");
			String str = sc.nextLine();
			if(str.equals("x")) break;
			try {
				num1 = Integer.parseInt(str);
				System.out.println("두 번째 숫자를 입력하세요");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
			}
			catch(NumberFormatException e) {
				System.out.println("숫자로 변경할 수 없는 문자입니다");
			}
				catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
