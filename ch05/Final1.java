package ch05;

public class Final1 {
	public static void main(String[] args) {
		final float pi = 3.14f; // final은 값을 못 바꾼다.
		int r = 10; r = 20; // 반지름 r은 바꿀 수 있다.
		System.out.println("반지름이 "+r+"인 원의 면적 : " + r*r*pi);
	}
}
