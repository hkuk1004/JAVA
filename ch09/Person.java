package ch09;

public class Person {
	String jumin;
	String name;
	int age;
	public Person(String jumin, String name, int age) {
		this.jumin = jumin; this.name = name; this.age = age;
	}
	@Override
	// 외부에서 들어온 객체가  Person으로 만든 객체면 주민번호가 같으면 같다고 인정하고
	// 아니면 다르다고 하자
	public boolean equals(Object obj) {
		// 숫자를 비교할 때는 ==, 문자를 비교할 때는  equals
		if(obj != null && obj instanceof Person) {
			return jumin.equals(((Person)obj).jumin);
			// return jumin == ((Person)obj).jumin;
		} else return false;
	}
	public String toString() {
		return "이름 : "+name +", 주민번호 : "+jumin + ", 나이 : "+age;
	}
}
