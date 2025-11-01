import java.io.FileInputStream;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int z = 1; z <= T; z++) {
			int n = 9;
			int[][] arr = new int[n][n];
			for(int i = 0 ; i < n ; i ++) {
				for(int j = 0 ; j < n ; j ++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			boolean flag = true;
			//1. 가로 찾기
			for(int i = 0 ; i < n ; i ++) {
				int[] temp = new int[10];
				for(int j = 0 ; j < n ; j ++) {
					temp[arr[i][j]] ++;
				}
				for(int k = 1; k <= 9; k ++) {
					if(temp[k] == 0) {
						flag = false;
						break;
					}
				}
			}
			//2. 세로 찾기
			for(int i = 0 ; i < n ; i ++) {
				int[] temp = new int[10];
				for(int j = 0 ; j < n ; j ++) {
					temp[arr[j][i]] ++;
				}
				for(int k = 1; k <= 9; k ++) {
					if(temp[k] == 0) {
						flag = false;
						break;
					}
				}
			}
			
			//3. 3x3 찾기
			for(int i = 0 ; i < n ; i +=3) {
				for(int j = 0 ; j < n ; j+=3) {
					int[] temp = new int[10];
					for(int k = i ; k < i + 3; k ++) {
						for(int l = j; l <j + 3; l ++) {
							temp[arr[k][l]] ++;
						}
					}
					for(int k = 1; k <= 9; k ++) {
						if(temp[k] == 0) {
							flag = false;
							break;
						}
					}
				}
			}
			
			if(flag) System.out.println("#" + z + " "  + 1);
			else  System.out.println("#" + z + " "  + 0);
		}
	}
}
