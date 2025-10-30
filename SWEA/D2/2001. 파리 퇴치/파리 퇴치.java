import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int z = 1; z <= T; z++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int ans = 0;
			for (int i = 0; i <= n - m; i++) {
				for (int j = 0; j <= n - m; j++) {
					int sum = 0;
					for (int k = i; k < i + m; k++) {
						for (int l = j; l < j + m; l++) {
							sum += arr[k][l];
						}
					}
					ans = Math.max(ans, sum);
				}
			}
			System.out.println("#" + z + " " + ans);
		}
	}
}
