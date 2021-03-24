package ch03;

public class If2 {
	public static void main(String[] args) {
		//int i1 = 10;
		// Integer.parseInt는 args[0]에 있는 문자를 정수로 바꿔라
		 int i1 = Integer.parseInt(args[0]);
		// i1이 0보다 크면 양수입니다
		// 숫자는 i1입니다
		// i1이 0보다 작거나 같으면
		// 음수 입니다
		// 절대값은 -i1입니다.
		if(i1 > 0) {
			System.out.println("숫자는 " + i1 + "입니다.");
			System.out.println("i1은 양수입니다. ");
		}else {
			System.out.println("음수입니다.");
			System.out.println("절대값은 " + -i1 + "입니다.");
		}
	}
}
