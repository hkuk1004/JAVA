package ch11;
// ��ü�� �����ϱ� ���ؼ��� Comparable�� �����ؾ� �Ѵ�
public class Member1 implements Comparable<Member1> {
	String name;
	public Member1(String name) {
		this.name = name;
	}
//	������ ������ ������ �Ѵ�
	public int compareTo(Member1 o) {
		return name.compareTo(o.name);
	}
	public String toString() {
		return name;
	}
}