package ch07;

public class Teacher2 extends Person2 {
	private String subject;
	public Teacher2(String name, int age, String subject) {
		
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	void print() {
		super.print();
		System.out.println("°ú¸ñ : " + subject);
	}
}
