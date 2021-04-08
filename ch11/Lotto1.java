package ch11;
import java.util.HashSet;
import java.util.Set;
public class Lotto1 {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
		// 중복을 방지해서 검사 필요없다
		while (lotto.size() < 6 ) {
			int num = (int)(Math.random()*45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}