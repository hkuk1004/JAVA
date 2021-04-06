package ch10;

public class Thorw1 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		m2();		
	}

	private static void m2() {
		// 여기서 예외를 발생 시키겠다
		try {
		throw new Exception("대박 에러"); 
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
