package ch05;
class Card{
	String kind;
	int number;
	static int width, height;
	void print(){
		System.out.println("���� : "+kind +"\t��ȣ : "+number);
		System.out.println("���� : "+width+"\t���� : "+height);
		System.out.println("==========================");
	}
}

public class CardEx {
	public static void main(String[] args) {
		Card.width = 100; Card.height = 250;
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		card1.kind = "�����̵�"; card1.number = 7;
		card2.kind = "��Ʈ"; card2.number = 1;
		card3.kind = "Ŭ�ι�"; card3.number = 10;
		card1.print();
		card2.print();
		card3.print();
	}
}
