package ch10;

public class Throws1 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			try {
				m1(i);
			}catch(ArithmeticException e) {
				System.out.println("0���� ������");
			}
		}
	}
	private static void m1(int i) throws ArithmeticException {
			m2(i);
		/*try {
			m2(i);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������");
		}*/
	}
	// throws�� ���ܰ� �߻��ϸ� �� �޼��带 ȣ���� ������ ���ܷ� ������
	private static void m2(int i) throws ArithmeticException{
		int k = 12;
		/*try {
			System.out.printf("%d / %d = %d\n",k, i, k/i);
		} catch(ArithmeticException e) {
			System.out.println("0���� ������");
		} */
		System.out.printf("%d / %d = %d\n",k, i, k/i);
	}
}
