

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	static String[] secret = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111",
			"0111011", "0110111", "0001011"};
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int z = 1 ; z <= T; z ++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ans = 0;
			char[][] arr = new char[n][m];
			for(int i = 0; i < n; i ++) {
				arr[i] = sc.next().toCharArray();
			}
			//56개 암호코드는 7개 //홀수 자리의 합 *3 + 짝수자리의 합이 10의 배수이면 올바른 암호코드
			int x = 0;
			int y = 0;
			for(int i = 0 ; i < n ; i ++) {
				for(int j = 0 ; j < m ; j ++) {
					if(arr[i][j] == '1') {
						x = i;
						y = j;
					}
				}
			}
			
			int even = 0;
			int odd = 0;
			int total = 0;
			//j 끝에서 56개를 뒤로 가야함
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i <= y; i ++) {
				sb.append(arr[x][i]);
			}
			String result = sb.toString().substring(y-55, y+1);
		
			for(int i = 0 ; i < result.length(); i +=7) {
				String temp = result.substring(i, i+7);
				
				for(int j = 0 ; j < secret.length; j ++) {
					if(secret[j].equals(temp)) {
						if((i / 7) % 2 == 0) {
							odd += j;
							total += j;
						}else {
							even += j;
							total += j;
						}
					}
				}
			}
			odd *= 3;
		
			if((odd + even) % 10 == 0) {
				ans = total;
			}
			System.out.println("#" + z + " " + ans);
		}
	}
}