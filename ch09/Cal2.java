package ch09;

import java.util.Calendar;

public class Cal2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); //�� �޿� ��° ��
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); //�ϳ� �� ��° ��
	}
}
