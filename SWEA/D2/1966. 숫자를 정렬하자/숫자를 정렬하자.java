

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int z = 1 ; z<= T; z++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0 ; i < n ; i ++) {
				arr[i] = sc.nextInt();
			}
			System.out.print("#" + z + " ");
			Arrays.stream(arr).sorted().forEach(num -> System.out.print(num + " "));
			System.out.println();
		}
	
	}
}
