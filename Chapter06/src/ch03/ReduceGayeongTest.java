package ch03;

import java.util.Arrays;

public class ReduceGayeongTest {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 60};
		int temp = Arrays.stream(arr).reduce(40, (x, y) -> x+y);
		int max = Arrays.stream(arr).reduce(2, (s1, s2)->{
			if (s1 >= s2) {
				return s1;
			} else return s2;
		});
		System.out.println(temp);
		System.out.println(max);
	}
}
