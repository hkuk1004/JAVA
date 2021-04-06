package ch09;

import java.util.Calendar;
import java.util.Date;

public class Cal1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Calendar : 추상클래스
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n",cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		// 31 + 28 + 31 + 6 : 1년 중에 몇일
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		Date date = new Date();
		System.out.println(date);
	}
}
