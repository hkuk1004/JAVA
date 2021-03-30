package ch05;
class Score2{
	String name;
	int[] score;
	String[] tit; // 인스턴스변수 (객체를 생성하고 접근할 수 있음)
	void title() {
		System.out.print("이름\t");
		for(int i=0; i<tit.length; i++) {
			System.out.print(tit[i]+"\t");
		}
		System.out.print("총점\t평균\n");
		System.out.println("=============================================");
	
	}
	void print() {
		int sum = 0;
		System.out.print(name+"\t");
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			System.out.print(score[i]+"\t");
		}
		System.out.println(sum+"\t"+sum/score.length);
	}
}

public class Score2Ex {
	public static void main(String[] args) {
		Score2 sc1 = new Score2();
		Score2 sc2 = new Score2();
		Score2 sc3 = new Score2();
		sc1.tit = new String[] {"국어","영어","수학"};
		sc1.name = "홍길동";
		sc1.score = new int[] {70,80,90};
		sc2.name = "블랙핑크";
		sc2.score = new int[] {88,77,82};
		sc3.name = "아이유";
		sc3.score = new int[] {78,96,69};
		sc1.title();
		sc1.print();
		sc2.print();
		sc3.print();
		}
}
