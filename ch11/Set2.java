package ch11;
import java.util.HashSet;
public class Set2 {
	public static void main(String[] args) {
		String[] snakes = {"±¸··ÀÌ","ÆÈ··ÀÌ","±¸··ÀÌ","Ä¥··ÀÌ","ÆÈ··ÀÌ","À°··ÀÌ"};
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();		
		for (String snake: snakes) {
			// snakesµ¥ÀÌÅÍ hs1¿¡ ÀÔ·ÂÇÏ°í
			if (!hs1.add(snake)) {
				// ÀÔ·ÂÀÌ ¾ÈµÈ °ÍÀº hs2¿¡ ÀÔ·ÂÇØ¶ó
				hs2.add(snake);
			}
		}		
		// ¿Ï·á ÈÄ¿¡ Ãâ·Â
		System.out.println(hs1);
		System.out.println(hs2);
		hs1.removeAll(hs2);
		System.out.println(hs1);
		System.out.println(hs2);
	}
}