package ch07;

class Product {
//	1. 매개변수 있는 생성자 삭제, 2. default생성자 추가, 3. 자식생성자 super(정수)추가
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공하는 보너스 점수
	//Product() {}
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}
class Tv extends Product{
	Tv() { super(100); }
	public String toString() {
		return "Tv";
	}
}
public class ProductEx {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}