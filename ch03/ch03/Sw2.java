package ch03;

public class Sw2 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String msg = "";
		// 1이면 안녕하세요
		// 2 면 반갑습니다
		// 3이면 처음 뵙겠습니다.
		// 기타 누구세요
		switch(num) {
		case 1 : 
			msg = "안녕하세요";
			break;
		case 2 :
			msg = "반갑습니다.";
			break;
		case 3 : 
			msg = "처음 뵙겠습니다.";
			break;
		default : 
			msg = "누구세요";
		}
		System.out.println(msg);
	}
}
