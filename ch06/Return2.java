package ch06;
class B3{
	void cal(int x, int y) {
		System.out.printf("%d + %d = %d\n",x,y,x+y);
		System.out.printf("%d - %d = %d\n",x,y,x-y);
		if(y==0) {
			System.out.println("여기까지 수행");
			return; // return 만나면 메서드 종료
		}
		else System.out.printf("%d * %d = %d\n",x,y,x/y);
		System.out.printf("%d / %d = %d\n",x,y,x*y);
	}
}
public class Return2 {
	public static void main(String[] args) {
		B3 a1 = new B3();
		a1.cal(12, 3);
		a1.cal(3, 0);
		a1.cal(12, 6);
	}
}
