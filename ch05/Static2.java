package ch05;
class A2 {
	int num1; // 항상 초기값이 0
	static int num2; // 변경된 값을 보관해서 다음에 생성할 때 추가
	void print() {
		System.out.println("num1 = " + ++num1+", num2 = "+ ++num2);

	}
}
public class Static2 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			A2 a2 = new A2();
			a2.print();
		}
		A2 a3 = new A2();
		a3.print();
	}
}
