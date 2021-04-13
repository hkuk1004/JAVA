package ch18;
@FunctionalInterface // : 함수적 인터페이스 인지 체크
interface MyFun2{
	void method(int x);
//	void m2(); // @FunctionalInterface가 있으면 함수 1개만 가능
}
public class Lamda2 {
	public static void main(String[] args) {
		MyFun2 mf2;
		mf2 = (x) -> {
			int result = x * 5;
			System.out.println("결과 : " + result);
		};
		mf2.method(4);
		mf2=(x)->{System.out.println("결과 : "+ x*7);};
		mf2.method(5);
		mf2 = x->{System.out.println("결과 : "+ x*3);}; // 매개변수가 1개인 경우 ( ) 생략 가능
		mf2.method(3);
		mf2 = x-> System.out.println("결과 : "+ x*6); // 문장이 1개인 경우 { }; 생략 가능
		mf2.method(7);
	}
}
