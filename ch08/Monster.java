package ch08;
interface Bird{
	void eat();
}
public class Monster extends Person2 implements Fish,Bird { // Person2 ���, Fish,Bird ����
	public static void main(String[] args) {
		Monster mt = new Monster();
		mt.eat();
		mt.swim();
		mt.move();
	}

	public void eat() {
		System.out.println("�θ��� �ɾ� �Դ´�");
	}

	public void swim() {
		System.out.println("���ӿ��� ��ð� ���ģ��");
	}
}
