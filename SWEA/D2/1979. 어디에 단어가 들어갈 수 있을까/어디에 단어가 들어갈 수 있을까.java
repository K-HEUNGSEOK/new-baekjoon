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
			int ans = 0;
			//1.입력받기
			int[][] arr = new int[n][n];
			for(int i = 0 ; i < n ;  i++) {
				for(int j = 0 ; j < n ; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			//2.가로 로직
			for(int i = 0 ; i < n ; i++) {
				int cnt = 0;
				for(int j = 0 ; j < n ; j++) {
					if(arr[i][j] == 0) {
						if(cnt == m) {
							ans ++;
						}
						cnt = 0;
					}else {
						cnt ++;
					}
				}
				if(cnt == m) {
					ans ++;
				}
			}
		
			
			
			//3.세로 로직
			for(int i = 0 ; i < n ; i++) {
				int cnt = 0;
				for(int j = 0 ; j < n ; j++) {
					if(arr[j][i] == 0) {
						if(cnt == m) {
							ans ++;
						}
						cnt = 0;
					}else {
						cnt ++;
					}
				}
				if(cnt == m) {
					ans ++;
				}
			}
		
			System.out.println("#" + z + " " +ans);
		}
	}
}
