package ch07;

public class FruitBuyer1 {
	int numOfApple = 0;
	int money = 5000;
	void buyFruit(FruitSeller1 fs, int money) {
		int num = fs.saleApple(money); // 구매한 사과 갯수
	}
}
