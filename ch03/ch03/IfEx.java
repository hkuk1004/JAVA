package ch03;

public class IfEx {
	public static void main(String[] args) {
		// 1) 10 미만의 값입니다
		// 2) 10 이상 100 미만의 값 입니다
		// 3) 100 이상 1000 미만의 값 입니다
		// 4) 1000 이상의 값입니다.
		int value = Integer.parseInt(args[0]);
		String msg = "";
		if(value<10)
			msg = "10 미만의 값입니다.";
		else if(value < 100) 
			msg = "10 이상 100미만의 값입니다.";
		else if(value <1000)
			msg = "100 이상 1000미만의 값입니다.";
		else
			msg = "1000 이상의 값입니다.";
		System.out.println("value :"  + value + "은 " + msg);
	}
}
