package ch07;

public class Car2 {
	private Engine eg;
	private String color;
	Car2() {}
	Car2(Engine eg, String color){
		this.eg = eg; this.color = color;
	}
	public String getColor() {return color; }
	public Engine getEg() { return eg; }
	void print() {
		eg.print();
		System.out.println("»ö±ò : "+ color);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEg(Engine eg) { this.eg = eg; }
}
