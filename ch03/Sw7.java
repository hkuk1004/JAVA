package ch03;

public class Sw7 {
	public static void main(String[] args) {
		int salary = Integer.parseInt(args[0]);
		String grade = "";
		// �޿��� 10000000 �̻��̸� A
		// �޿��� 8000000 �̻��̸� B
		// �޿��� 6000000 �̻��̸� C
		// �޿��� 4000000 �̻��̸� D
		// �޿��� 2000000 �̻��̸� E
		//       �̸��� F
		switch(salary/1000000) {
		case 10: grade = "A"; break;
		case 9 : case 8: grade = "B"; break;
		case 7 : case 6: grade = "C"; break;
		case 5 : case 4: grade = "D"; break;
		case 3 : case 2: grade = "E"; break;
		default: grade = "F"; 
		}
		System.out.println("�޿��� " + salary + " �̰� ����� " + grade + " �Դϴ�.");
	}
}
