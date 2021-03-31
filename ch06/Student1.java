package ch06;

public class Student1 {
	String name;
	int kor, eng, math;
	Student1() {} // 생성자가 하나라도 있으면 default 생성자는 생성안됨
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
		System.out.println("이름 : " + name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
	}
}
