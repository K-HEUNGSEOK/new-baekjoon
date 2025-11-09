

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int z = 1; z <= T; z++) {
			int n = sc.nextInt();
			int[] arr = new int[100];
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
			// 최저와 최고 높이를 계속 갱신하면서 -- ++ 을 해준다
			// 가장 높은곳과 낮은곳의 차이가 1이내면 평탄화를 그만한다
			// 최고점과 최저점의 차이를 낸다

			while (n-- > 0) {
				Arrays.sort(arr);
				arr[0]++;
				arr[99]--;
				int total = arr[99] - arr[0];
		
				if (total <= 1) {
					break;
				}
			}
			Arrays.sort(arr);
			System.out.println("#" + z + " " + (arr[99] - arr[0]));
		}
	}
}
