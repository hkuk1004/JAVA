package ch01; // ch01패키지 안에 HelloJava라는 프로그램을 만듬
// class HelloJava HelloJava 라는 java프로그램, 클래스 정의
// HelloJava라는 파일명과 HelloJava자바 프로그램명이 같아야 main이 실행
public class HelloJava { // {는 자바 class 시작 
	// main 메서드명인데 자바가상머신(JVM)이 호출할 수 있는 진입점
	// void 반환형 : 아무것도 반환할 것이 없다, 실행만 하고 종료
	// main메서드 javaScript function유사
	/* 주석 시작이고 주석종료는 */
	/* 컨트롤 키+ shift와 ?를 동시에 누르면 주석처리
	 * 주석 주석
	 */
	public static void main(String[] args) { // {는 main이라는 method 시작
		// 큰 따옴표("")에 있는 문장을 그대로 출력
		System.out.println("Hello Java"); // ;는 자바 문장 종료
		// ln : line의 약자로 출력 후에 한 줄 떼라
		System.out.println("대박 사건");
	} // }는 main이라는 method 종료
} // }는 자바 class 종료
