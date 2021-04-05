package ch09;

public class Person {
	String jumin;
	String name;
	int age;
	public Person(String jumin, String name, int age) {
		this.jumin = jumin; this.name = name; this.age = age;
	}
	@Override
	// �ܺο��� ���� ��ü��  Person���� ���� ��ü�� �ֹι�ȣ�� ������ ���ٰ� �����ϰ�
	// �ƴϸ� �ٸ��ٰ� ����
	public boolean equals(Object obj) {
		// ���ڸ� ���� ���� ==, ���ڸ� ���� ����  equals
		if(obj != null && obj instanceof Person) {
			return jumin.equals(((Person)obj).jumin);
			// return jumin == ((Person)obj).jumin;
		} else return false;
	}
	public String toString() {
		return "�̸� : "+name +", �ֹι�ȣ : "+jumin + ", ���� : "+age;
	}
}
