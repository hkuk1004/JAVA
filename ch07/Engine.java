package ch07;

public class Engine {
	private int displacement;
	private String type;
	public Engine() {	}
	Engine(int displacement, String type){
		this.displacement = displacement; this.type = type;
	}
	public int getDisplacement() { return displacement; }
	public String getType() { return type; }
	void print() {
		System.out.println("======================");
		System.out.println("���� : "+ displacement);
		System.out.println("����Ÿ�� : "+ type);
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	public void setType(String type) { this.type = type; }
}
