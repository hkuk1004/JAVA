package ch07;

public class Outer {
	// Inner class는 외부 클래스의 멤버변수, 메서드를 자기것처럼 사용 가능
	// 컴파일된 클래스 외부클래스.class 와 외부클래스$내부클래스.class 생성
	class Inner{
		private float rate = 0.5f;
		public float volume() {
			return rate * height * width;
		}
	}
	private int height;
	private int width;
	public Outer(int height, int width) {
		this.height = height; this.width = width;
	}
	public Inner getInner() {
		return new Inner();
	}
}
