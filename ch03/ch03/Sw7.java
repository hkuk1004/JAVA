package ch03;

public class Sw7 {
	public static void main(String[] args) {
		int salary = Integer.parseInt(args[0]);
		String grade = "";
		// 급여가 10000000 이상이면 A
		// 급여가 8000000 이상이면 B
		// 급여가 6000000 이상이면 C
		// 급여가 4000000 이상이면 D
		// 급여가 2000000 이상이면 E
		//       미만은 F
		switch(salary/1000000) {
		case 10: grade = "A"; break;
		case 9 : case 8: grade = "B"; break;
		case 7 : case 6: grade = "C"; break;
		case 5 : case 4: grade = "D"; break;
		case 3 : case 2: grade = "E"; break;
		default: grade = "F"; 
		}
		System.out.println("급여는 " + salary + " 이고 등급은 " + grade + " 입니다.");
	}
}
