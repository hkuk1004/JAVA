package ch10;
import java.util.Scanner;
public class Except2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2 = 0;
		while(true) {
			System.out.println("ù ��° ���ڸ� �Է��ϼ���");
			String str = sc.nextLine();
			if(str.equals("x")) break;
			try {
				num1 = Integer.parseInt(str);
				System.out.println("�� ��° ���ڸ� �Է��ϼ���");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
			}
			catch(NumberFormatException e) {
				System.out.println("���ڷ� ������ �� ���� �����Դϴ�");
			}
				catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("���α׷� ����");
		sc.close();
	}
}
