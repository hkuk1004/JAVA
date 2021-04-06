package ch09;

import java.util.Random;

public class Random2 {
	public static void main(String[] args) {
		int[] number = new int[100]; // 0~9 사이 정수 100개
		int[] count = new int[10]; // 초기값은 0
//			     0  1  2  3  4  5  6  7  8  9	
//		count = {0, 0, 0, 2, 0, 1, 0, 1, 2, 1}
		Random ran = new Random();
		for(int i=0; i<number.length; i++) {
			number[i] = ran.nextInt(10); // number[i] 0~9사이 정수값
			System.out.print(number[i] + " "); // 숫자출력하고 한칸 옆으로
			if(i % 10 == 9) System.out.println(); // 10개 출력하고 줄바꿈
		}
		for(int i=0; i<number.length; i++) {
			// number[i]가 들어있는 count 인덱스에 1증가
			count[number[i]]++;
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(i+"의 개수 : "+printGraph('#', count[i]));
		}
	}
	public static String printGraph(char ch, int value) {
		char[] bar = new char[value];
		for(int i=0; i<bar.length; i++) { bar[i] = ch; }
		return new String(bar);
	}
}
