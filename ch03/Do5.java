package ch03;

import java.io.IOException;

public class Do5 {
	public static void main(String[] args) throws IOException {
		// System.in.read()를 통하여 숫자를 받아서 do ~ while로 구구단 출력
		System.out.println("보고싶은 구구단 숫자를 입력하세요: ");
		int num = System.in.read() - '0';
		System.out.println("구구단 " + num + "단");
		int i = 1;
		do {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			//System.out.println(num+"*"+i+"="+num*i);
			i++;
		} while(i<=9);
	}
}
