package ch06;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ȫ�浿"; 
		p1.age = -35;
//		�޼��带 ����Ͽ� �����ϸ� �޼��忡�� �����͸� üũ�� �� �ִ�
		Person p2 = new Person();		
		p2.setName("����"); 
		p2.setAge(-25); // üũ�� ����
		
		p1.print();
		p2.print();
	}
}