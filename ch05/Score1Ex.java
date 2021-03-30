package ch05;
class Score1{
	String name;
	int kor, eng, math;
	void print() {
		int sum = kor + eng + math;
		System.out.println("==="+name+"의 성적 ===");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/3);
	}
}

public class Score1Ex {
	public static void main(String[] args) {
		Score1 sc1 = new Score1();
		Score1 sc2 = new Score1();
		Score1 sc3 = new Score1();
		sc1.name = "홍길동";
		sc1.kor = 70; sc1.eng = 80; sc1.math = 90;
		sc2.name = "블랙핑크";
		sc2.kor = 88; sc2.eng = 77; sc2.math = 82;
		sc3.name = "아이유";
		sc3.kor = 78; sc3.eng = 96; sc3.math = 69;
		sc1.print();
		sc2.print();
		sc3.print();
		}
}
