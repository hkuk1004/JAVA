package ch09;

import java.util.Calendar;
import java.util.Date;

public class Cal1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Calendar : �߻�Ŭ����
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�\n",cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		// 31 + 28 + 31 + 6 : 1�� �߿� ����
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		Date date = new Date();
		System.out.println(date);
	}
}
