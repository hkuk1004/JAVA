package ch07;
// this(), super() ������ �ش��ϴ� ������ �۾��� ������ ȣ���� ������ ���ƿͼ� �Ʒ� ���๮�� �۾�
class H1 {
	int x; // 34 ����
	H1(int x){ // 7
		this.x = x;
		System.out.println("�θ� �Ű����� 1��"); 
	}
	H1(int x, int y){ // 5
		this(x); // 6
		System.out.println("x = "+x); // 8
	}
	void print() {
		System.out.println("x = "+x); // 11
	}
}
class H2 extends H1{
	H2(int x, int y){ // 3
		super(x,y); // 4
		System.out.println("�ڽ� �� ��"); // 9
	}
	H2(int x, int y, int z){ // 1
		this(x, y); // 2
		System.out.println("�ڽ� �Ű����� �� ��"); // 10
	}
}
public class Super4 {
	public static void main(String[] args) {
		H2 h = new H2(34,45,67); 
		h.print();
	}
}
