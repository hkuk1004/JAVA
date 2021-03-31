package ch06;
class E2{
	int add(int x, int y) {
		return x + y;
	}
/*	int add(int a, int b) { // 변수명 다른 것은 안되고
		return a + b;
	}
*/
	double add(double x, double y) {
		return x + y;
	}
	String add(String name) {
		return "안녕하세요" + name + "님";
	}
}
public class OverLoading1 {
	public static void main(String[] args) {
		E2 e = new E2();
		System.out.println(e.add(12, 15));
		System.out.println(e.add(3.6, 7.2));
		System.out.println(e.add("철수"));
	}
}
