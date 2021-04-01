package ch07;
public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("세정", 28, "1반");
		Student st2 = new Student("뷰", 27, "2반");
		Teacher th1 = new Teacher("유느님", 51, "자바");
		Teacher th2 = new Teacher("이효리", 38, "JSP");
		Manager mg1 = new Manager("준하", 52, "화장실 청소");
		
		st1.printSt(); st2.printSt();
		th1.printTh(); th2.printTh();
		mg1.printMg();
	}
}