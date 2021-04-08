package ch11;
import java.util.HashSet;
public class Set2 {
	public static void main(String[] args) {
		String[] snakes = {"������","�ȷ���","������","ĥ����","�ȷ���","������"};
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();		
		for (String snake: snakes) {
			// snakes������ hs1�� �Է��ϰ�
			if (!hs1.add(snake)) {
				// �Է��� �ȵ� ���� hs2�� �Է��ض�
				hs2.add(snake);
			}
		}		
		// �Ϸ� �Ŀ� ���
		System.out.println(hs1);
		System.out.println(hs2);
		hs1.removeAll(hs2);
		System.out.println(hs1);
		System.out.println(hs2);
	}
}