package ch02;

public class OpSp5 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		// Math.round �Ǽ��� �ݿø��Ͽ� ������ ��ȯ
		float shortPi = Math.round(pi*1000)/ 1000f;
		// Math.round(3141.538f) / 1000f => 3142 / 1000f => 3.142f
		System.out.println("shortPi = " + shortPi);
	}
}
