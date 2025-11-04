

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
			//10개의 수를 입력 받아, 최대 수와 최소 수를 제외한 나머지의 평균값을 출력하는 프로그램을 작성하라.
			int[] arr = new int[10];
			for(int i = 0 ; i < 10; i ++) {
				arr[i] = sc.nextInt();
			}
			
			double ans = Arrays.stream(arr).sorted()
			.skip(1).limit(8).average().getAsDouble();
			
			System.out.println("#" + z + " " + Math.round(ans));
		}
	
	}
}
