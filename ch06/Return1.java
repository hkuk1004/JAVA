package ch06;
class B2{
	// int 는 더한 결과가 정수
	// void(비어있다는 의미) : 반환할 값이 없다.
	int add(int x, int y) {
		return x + y; // 반환형이 int면 return뒤의 결과가 int여야한다
	}
	void minus(int x, int y) {
		System.out.printf("%d - %d = %d\n",x,y,x-y);
	}
}
public class Return1 {
	public static void main(String[] args) {
		B2 b2 = new B2();
//		b2.add(12, 3);
		System.out.println(b2.add(12, 3));
		int k = b2.add(10, 7);
		System.out.println("k = " + k);
//		System.out.println(b2.minus(12, 6)); // 출력할 값이 없어서 에러
	}
}
