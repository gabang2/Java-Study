package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[10]; // 값이 없으면 0으로 초기화 된다.
		int total = 0;
		for(int i=0, num=1; i<arr.length;i++) {
			arr[i] = num++;
			System.out.println(arr[i]);
		}
		for(int num : arr) {
			total += num;
		}
		System.out.println("토탈:" + total);
	}
}
