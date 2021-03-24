package ch03;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		if (a > 0) {
			System.out.println("a는 양수이고 숫자는 " + a + "입니다");
		} else { // else는 조건이 거짓일 때 실행
			System.out.println("a는 음수입니다");
			System.out.println("숫자는 " + a + "입니다");
		}
		System.out.println("프로그램 종료");
	} 

}
