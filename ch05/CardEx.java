package ch05;
class Card{
	String kind;
	int number;
	static int width, height;
	void print(){
		System.out.println("종류 : "+kind +"\t번호 : "+number);
		System.out.println("가로 : "+width+"\t세로 : "+height);
		System.out.println("==========================");
	}
}

public class CardEx {
	public static void main(String[] args) {
		Card.width = 100; Card.height = 250;
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		card1.kind = "스페이드"; card1.number = 7;
		card2.kind = "하트"; card2.number = 1;
		card3.kind = "클로버"; card3.number = 10;
		card1.print();
		card2.print();
		card3.print();
	}
}
