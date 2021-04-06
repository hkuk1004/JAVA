package ch10;

public class Throws1 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			try {
				m1(i);
			}catch(ArithmeticException e) {
				System.out.println("0으로 못나눠");
			}
		}
	}
	private static void m1(int i) throws ArithmeticException {
			m2(i);
		/*try {
			m2(i);
		}catch(ArithmeticException e) {
			System.out.println("0으로 못나눠");
		}*/
	}
	// throws는 예외가 발생하면 이 메서드를 호출한 곳으로 예외로 던진다
	private static void m2(int i) throws ArithmeticException{
		int k = 12;
		/*try {
			System.out.printf("%d / %d = %d\n",k, i, k/i);
		} catch(ArithmeticException e) {
			System.out.println("0으로 못나눠");
		} */
		System.out.printf("%d / %d = %d\n",k, i, k/i);
	}
}
