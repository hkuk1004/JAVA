package ch06;
// this �� ������ ��ü �ڽ�, this( )Ŭ���� ���� �ٸ� ������
// this(�Ű�����, ...) ���� Ŭ������ �ٸ� ������ ȣ��
// this() �����ڸ� �ٷ� �Ʒ� ��ġ
public class Score1 {
	public Score1() { // 5
		System.out.println("�Ű������� ���� ������"); // 6
	}
	public Score1(String name) { // 3
		this(); // 4
		System.out.println("�Ű����� �̸� : "+name); // 7
		// this(); ������ ������ ù�� ° �ٿ� �־�� �ȴ�.
	}
	public Score1(String name, int kor) { // 1
		this(name); // 2
		System.out.println("�Ű����� �̸� : "+ name +", ���� : " + kor); // 9
		}
	void print() {
		System.out.println("���"); // 10
	}
}
