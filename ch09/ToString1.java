package ch09;
class Card{
	String kind;
	int number;
	public Card(String kind, int number) {
		this.kind = kind; this.number = number;
	}
	// 객체를 출력할 때 보고싶은 형태
	public String toString() {
		return "카드[종류 : "+ kind + ", 번호 : " + number + "]";
	}
	// 카드 종류가 같으면 같다고 정의
	// 번호가 같으면 같다고 정의
	public boolean equals(Object obj) {
		return kind.equals(((Card)obj).kind);
	}
}
public class ToString1 {
	public static void main(String[] args) {
		Card card1 = new Card("스페이드", 10);
		Card card2 = new Card("스페이드",7);
		Card card3 = new Card("하트", 10);
		// 그냥 출력하면 패키지명.클래스명@해시코드 : ch09.Car@4926097b
		System.out.println("card1 = " + card1);
		if(card1.equals(card2)) System.out.println("card1과 card2는 같다");
		else System.out.println("card1과 card2는 다르다");
		if(card1.equals(card3)) System.out.println("card1과 card3는 같다");
		else System.out.println("card1과 card3는 다르다");
	}
}
