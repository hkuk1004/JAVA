package ch06;

public class Return3 {
	public static void main(String[] args) {
// 		call(이름 전달)
		Return3 r = new Return3();
		String[] name = {"보라","세정","뷰","문수"};
		for (String n : name) {
			// String msg = Return3.call(n);
			String msg = r.call(n);
			System.out.println(msg);
		}
	}
	// 이름 + 님 안녕하세요 값을 return
	String call(String n) {
		return n + "님 안녕하세요";
	}
	

}