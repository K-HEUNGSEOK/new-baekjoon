import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int n, move;
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int z = 1; z <= T;  z ++) {
			n = sc.nextInt();
			int[][] arr = new int[n][n];
			
			int x = 0;
			int y = 0;
			int move = 0;
			for(int i = 0 ; i < n* n ; i ++) {
				arr[x][y] = i+1;
		
				int nx = x + dx[move];
				int ny = y + dy[move];
				
				if(isRange(nx,ny) && arr[nx][ny] == 0) {
					x = nx;
					y = ny;
				}else {
					move = (move+1) % 4;
					nx = x + dx[move];
					ny = y + dy[move];
					x = nx;
					y = ny;
				}
			}
			
			System.out.println("#" + z);
			for(int i = 0 ; i < n ; i ++) {
				for(int j = 0 ; j < n ; j ++) {
					System.out.print(arr[i][j] +" ");
				}
				System.out.println();
			}
			
		}
		
	}
	static boolean isRange(int x, int y ) {
		return 0 <= x && x < n && 0 <= y && y < n;
	}
}
