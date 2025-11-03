

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	static int[] number = {2,3,5,7,11};
	static int[] arr;
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int z = 1; z <= T; z ++) {
			arr = new int[5];
			int n = sc.nextInt();
			DFS(0,n);
			
			System.out.print("#" + z + " ");
			Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
			System.out.println();
		}
	}
	static void DFS(int v, int target) {
		if(target == 1) {
			return;
		}else {
			if(target % number[v] == 0) {
				arr[v]++;
				DFS(v, target / number[v]);
				
			}else {
				DFS(v + 1 , target);
			}
		}
	}
}
