package ch09;
import java.util.GregorianCalendar;
public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar(); // Calendar �߻� Ŭ����
		// ���� 0�� .. 11�� �̹Ƿ� 1�� �߰�
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�\n",
		cal.get(GregorianCalendar.YEAR),cal.get(GregorianCalendar.MONTH)+1,
		cal.get(GregorianCalendar.DATE));
		System.out.println(cal.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println(cal.get(GregorianCalendar.DAY_OF_YEAR));
		GregorianCalendar cal2 = new GregorianCalendar(2000,3,7);
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�\n",
				cal2.get(GregorianCalendar.YEAR),
				cal2.get(GregorianCalendar.MONTH)+1,
				cal2.get(GregorianCalendar.DATE));
	}
}
