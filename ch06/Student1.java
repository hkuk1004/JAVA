package ch06;

public class Student1 {
	String name;
	int kor, eng, math;
	Student1() {} // �����ڰ� �ϳ��� ������ default �����ڴ� �����ȵ�
	public Student1(String n, int k, int e, int m) {
		this.name = name; this.kor = kor; this.eng = eng; this.math = math;
	}
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		float avg = getTotal() / 3.0f;
		//float avg = getTotal() / (float)3;
		return avg;
	}
	void print() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
	}
}
