

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
			int ans = 0;
			int n = sc.nextInt();
			char[][] arr = new char[8][8];
			for(int i = 0 ; i < 8 ; i ++) {
				arr[i] = sc.next().toCharArray();
			}
			
			
			//가로
			for(int i = 0 ; i < 8 ; i ++) {
				for(int j = 0 ; j <= 8 - n; j ++) {
					StringBuilder sb = new StringBuilder();
					for(int k = j; k < j + n ; k ++) {
						sb.append(arr[i][k]);
					}
					if(isCheck(sb.toString())) {
						ans ++;
					}
				}
			}
			//세로
			for(int i = 0 ; i <= 8 -n ; i ++) {
				for(int j = 0 ; j < 8; j ++) {
					StringBuilder sb = new StringBuilder();
					for(int k = i; k < i + n ; k ++) {
						sb.append(arr[k][j]);
					}
					if(isCheck(sb.toString())) {
						ans ++;
					}
				}
			}
			System.out.println("#" + z + " " + ans);
		}
	}
	static boolean isCheck(String sb) {
		for(int i = 0 ; i < sb.length(); i++) {
			if(sb.charAt(i) != sb.charAt(sb.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
}