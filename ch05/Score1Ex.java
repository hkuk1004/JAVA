package ch05;
class Score1{
	String name;
	int kor, eng, math;
	void print() {
		int sum = kor + eng + math;
		System.out.println("==="+name+"�� ���� ===");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum/3);
	}
}

public class Score1Ex {
	public static void main(String[] args) {
		Score1 sc1 = new Score1();
		Score1 sc2 = new Score1();
		Score1 sc3 = new Score1();
		sc1.name = "ȫ�浿";
		sc1.kor = 70; sc1.eng = 80; sc1.math = 90;
		sc2.name = "����ũ";
		sc2.kor = 88; sc2.eng = 77; sc2.math = 82;
		sc3.name = "������";
		sc3.kor = 78; sc3.eng = 96; sc3.math = 69;
		sc1.print();
		sc2.print();
		sc3.print();
		}
}
