package ch07;
// this(), super() 있으면 해당하는 생성자 작업을 끝내고 호출한 곳으로 돌아와서 아래 실행문을 작업
class H1 {
	int x; // 34 저장
	H1(int x){ // 7
		this.x = x;
		System.out.println("부모 매개변수 1개"); 
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
		System.out.println("자식 두 개"); // 9
	}
	H2(int x, int y, int z){ // 1
		this(x, y); // 2
		System.out.println("자식 매개변수 세 개"); // 10
	}
}
public class Super4 {
	public static void main(String[] args) {
		H2 h = new H2(34,45,67); 
		h.print();
	}
}
