package ch06;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동"; 
		p1.age = -35;
//		메서드를 사용하여 접근하면 메서드에서 데이터를 체크할 수 있다
		Person p2 = new Person();		
		p2.setName("세정"); 
		p2.setAge(-25); // 체크가 가능
		
		p1.print();
		p2.print();
	}
}