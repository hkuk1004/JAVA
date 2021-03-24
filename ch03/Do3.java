package ch03;
import java.io.IOException;

public class Do3 {
	public static void main(String[] args) throws IOException {
		// 짝수를 입력하세요 do~while사용하면 원하는 짝수를 구할 때 까지 반복시킬 수 있음

		int num = 0; // 여기에 정의하면 main메서드 범위에서 사용
		do { // 7 + enter, enter => \r\n -> CR(앞으로 가라), LF(줄 바꿔라)
			// CR은 13, LF는 10
			System.out.println("한 자리 짝수를 입력하세요");
			//num은 사용범위가 do { 부터 } 까지 지역변수
			num = System.in.read() - '0';
			System.in.read(); // CR \r 처리
			System.in.read(); // LF \n처리
		}while(num % 2 == 1);
		System.out.println("입력한 짝수 : " + num);
	}
}
