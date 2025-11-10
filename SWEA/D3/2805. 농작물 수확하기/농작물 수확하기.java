

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	static int n;
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int z = 1; z <= T; z++) {
			n = sc.nextInt();
			char[][] temp = new char[n][n];
			for (int i = 0; i < n; i++) {
				temp[i] = sc.next().toCharArray();
			}
			int sum = 0;
			int x = n / 2;
			int y = n / 2;
	
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					if(isCheck(i,j,x,y)) {
						sum += (temp[i][j] -'0');
					}
				}
			}
			System.out.println("#"+z+ " " + sum);
		}
	}
	static boolean isCheck(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 -x2) + Math.abs(y1-y2) <= n/2;
	}
}