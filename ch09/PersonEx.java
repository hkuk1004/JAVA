package ch09;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("1111","배철수",35);
		Person p2 = new Person("2222","홍기동",42);
		Person p3 = new Person("3333","배철수",35);
		if(p1 == p2) System.out.println("p1과 p2는 같다");
		else System.out.println("p1과 p2는 다르다");
		if(p1 == p3) System.out.println("p1과 p3는 같다");
		else System.out.println("p1과 p3는 다르다");
		System.out.println("==================");
		if(p1.equals(p2)) System.out.println("p1과 p2는 같다");
		else System.out.println("p1과 p2는 다르다");
		if(p1.equals(p3)) System.out.println("p1과 p3는 같다");
		else System.out.println("p1과 p3는 다르다");
		System.out.println("p1 = " + p1.hashCode());
		System.out.println("p2 = " + p2.hashCode());
		System.out.println("p3 = " + p3.hashCode());
	}
}
