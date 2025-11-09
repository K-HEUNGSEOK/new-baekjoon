

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
			int index = sc.nextInt();
			int n = 100;
			int[][] arr = new int[n][n];
			int ans = 0;
			
			
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j ++) {
					arr[i][j] = sc.nextInt();
				}
			}
			//1.가로
			for(int i = 0 ; i < n ; i++) {
				int total = 0;
				for(int j = 0 ; j < n ; j++) {
					total += arr[i][j];
				}
				ans = Math.max(ans, total);
			}
			//2.세로
			for(int i = 0 ; i < n ; i++) {
				int total = 0;
				for(int j = 0 ; j < n ; j++) {
					total += arr[j][i];
				}
				ans = Math.max(ans, total);
			}
			//3.대각선
			int totalA = 0;
			for(int i = 0 ; i < n ; i++) {
				totalA += arr[i][i];
			}
			ans = Math.max(ans, totalA);
			//4.역대각선
			int totalB = 0;
			for(int i = 0 ; i < n ;i ++) {
				totalB += arr[i][n-1-i];
			}
			ans = Math.max(ans, totalB);
			System.out.println("#" + index + " " + ans);
		}
	}
}
