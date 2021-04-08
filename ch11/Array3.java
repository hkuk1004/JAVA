package ch11;

import java.util.ArrayList;

public class Array3 {
		public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<>();
			// Array3 ±¸··ÀÌ, ÆÈ··ÀÌ, Ä¥··ÀÌ, À°··ÀÌ, ±¸··ÀÌ µ¥ÀÌÅÍÃß°¡ÇÏ°í Ãâ·Â
			list.add("±¸··ÀÌ");list.add("ÆÈ··ÀÌ");list.add("Ä¥··ÀÌ");
			list.add("À°··ÀÌ");list.add("±¸··ÀÌ"); print(list);
			// ÀÎµ¦½º 1¹ø¿¡ ±¸··»ï Ãß°¡ÇÏ°í Ãâ·Â
			list.add(1,"±¸··»ó"); print(list);
			// ÀÎµ¦½º 3¹ø¿¡ µµ·æ·æÀ¸·Î ¼öÁ¤ÇÏ°í Ãâ·Â
			list.set(3,"µµ·æ·æ"); print(list);
			// ÀÎµ¦½º 2¹ø µ¥ÀÌÅÍ Áö¿ì°í Ãâ·Â
			list.remove(2); print(list);
			// ±¸··ÀÌ Áö¿ì°í Ãâ·Â
			list.remove("±¸··ÀÌ"); print(list); // ¾Õ¿¡ÀÖ´Â ±¸··ÀÌ ÇÏ³ª¸¸ »èÁ¦
		}
		private static void print(ArrayList<String> list) {
			for(String snake : list) {
				System.out.print(snake+"\t");
			}
			System.out.println();
		}
}
