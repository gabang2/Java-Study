package ch03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Tomas2");
		sList.add("Tomas3");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		sList.parallelStream().sorted().forEach(s -> System.out.print(s + " "));
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n));
		
		
	}

}
