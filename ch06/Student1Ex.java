package ch06;

public class Student1Ex {
	public static void main(String[] args) {
		Student1 st1 = new Student1();
		st1.name = "ȫ�浿";
		st1.kor = 100; st1.eng = 60; st1.math = 76;
		st1.print();
		Student1 st2 = new Student1("ȫ�浿",100,60,76);
		st2.print();
		Student1 st3 = new Student1("����",90,88,76);
		st3.print();
	}
}
