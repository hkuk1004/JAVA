package ch09;

import java.util.Calendar;

public class Cal2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); //이 달에 몇째 주
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); //일년 중 몇째 주
	}
}
