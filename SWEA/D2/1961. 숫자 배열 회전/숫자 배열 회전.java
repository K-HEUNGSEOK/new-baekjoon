import java.io.FileInputStream;
import java.util.*;

public class Solution {
	static int n;
	static StringBuilder sb;
	static String[][] ans;
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int z = 1; z <= T; z++) {
			n = sc.nextInt();
			ans = new String[n][3];
			sb = new StringBuilder();
			// 1.입력받기
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			// 2.배열 돌리기
			for (int f = 0; f < 3; f++) {
				arr = rotationArray(arr);
				print(arr);
			}
			String[] split = sb.toString().split(" ");
			
			int cnt = 0;
			for(int i = 0 ; i < 3 ; i ++) {
				for(int j = 0 ; j < n ; j ++) {
					ans[j][i] = split[cnt++];
				}
			}
			
			System.out.println("#" + z);
			for(int i = 0 ; i < n ; i ++) {
				for(int j = 0 ; j < 3 ; j ++) {
					System.out.print(ans[i][j] +" ");
				}
				System.out.println();
			}
		}
	}

	
	static void print(int[][] arr) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append(" ");
		}
	}

	static int[][] rotationArray(int[][] arr) {
		int[][] copy = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				copy[i][j] = arr[n - j - 1][i];
			}
		}
		return copy;
	}
}
