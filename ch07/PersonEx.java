package ch07;
public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("����", 28, "1��");
		Student st2 = new Student("��", 27, "2��");
		Teacher th1 = new Teacher("������", 51, "�ڹ�");
		Teacher th2 = new Teacher("��ȿ��", 38, "JSP");
		Manager mg1 = new Manager("����", 52, "ȭ��� û��");
		
		st1.printSt(); st2.printSt();
		th1.printTh(); th2.printTh();
		mg1.printMg();
	}
}