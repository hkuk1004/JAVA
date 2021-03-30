package ch05;

public class Person {
	// name, age, hobby
	// 매개변수 없는 생성
	// 이름
	// 이름, 나이
	// 이름, 나이, 취미
	String name; int age; String hobby;
	// 같은 클래스 내에서 생성자
	Person(){ }
	Person(String n){ 
		name = n;
	}
	Person(String n, int a){
		name = n; age = a;
	}
	Person(String n, int a, String h){
		name = n; age = a; hobby = h;
	}
	void print() {
		System.out.println("=============");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("취미 : "+hobby);
		System.out.println("=============");
	}
	
}
