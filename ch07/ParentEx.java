package ch07;
class Parent{
	int x = 100; // x= 200
	Parent() { // 4
		this(200); // Parent(int x) 를 호출
	}
	Parent(int x) { this.x = x; }
	int getX() { return x; }
}
class Child extends Parent {
	int x= 3000; //1000
	Child() { // 2
		this(1000); // Child(int x)를 호출
	}
	Child(int x)  { //3
		System.out.println("c 1 x = " + this.x);
		System.out.println("c 1 x = " + super.x);
		this.x = x;  // 7
		System.out.println("c 2 x = " + this.x);
		System.out.println("c 2 x = " + super.x);
	}
	int getX() { return x; }
}
public class ParentEx {
	public static void main(String[] args) {
		Child c = new Child(); // 1
		System.out.println("x = " + c.getX());
	}
}
