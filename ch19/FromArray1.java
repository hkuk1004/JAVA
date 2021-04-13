package ch19;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArray1 {
	public static void main(String[] args) {
		String[] strList = {"¼¼ÈÆ","¿µ¼±","Ã¶¼ö","±æµ¿"};
		Stream<String> strStream = Arrays.stream(strList);
		strStream.forEach(a->System.out.println(a+",")
		);
		System.out.println("=======================");
		int[] intArray = {12,34,56,77,25};
		IntStream stream2 = Arrays.stream(intArray);
		stream2.forEach(n->System.out.println(n+","));
	}
}
