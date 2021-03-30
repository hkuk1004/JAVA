package ch05;
class Cal{
	int x = 0, y = 0; // 멤버번수, 전역변수 클래스 밑에 있고 여러 메서드에서 사용 가능
	public void cal() {
		String title = "=== 연산결과 ==="; //지역변수 : 메서드 내에서 정의하고 그 안에서 사용
		System.out.println(title);
		System.out.println("덧셈 : "+ (x+y));
		System.out.println("뺄셈 : "+ (x-y));
		System.out.println("곱셈 : "+ (x*y));
		System.out.println("나눗셈 : "+ (x/y));
	}
}

public class CalEx { // 클래스를 여러개 사용할 경우 public 은 1개만
	// main 메서드가 있는 경우는 main 메서드가 있는 클래스만 public/ 클래스명은 파일명과 일치해야한다
	public static void main(String[] args) {
//		String str = "재밌지"; // 지역변수
//		x = 10; // 실행문이 전역변수를 사용하기 위해서 객체를 생성해야 됨
		Cal c1 = new Cal();
		c1.x = 10;
		c1.y = 4;
		Cal c2 = new Cal();
		c2.x = 12;
		c2.y = 3;
//		c1.title = "대박"; // title은 지역변수라 사용 불가능
		c1.cal();
		c2.cal();
	}
}
