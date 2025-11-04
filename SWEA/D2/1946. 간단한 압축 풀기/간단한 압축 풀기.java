

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
			int n = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			int cnt = 0;
			for(int i = 0 ; i < n; i ++) {
				char target = sc.next().charAt(0);
				int count = sc.nextInt();
				
				for(int j = 0 ; j < count; j ++) {
					sb.append(target);
					cnt ++;
					if(cnt == 10) {
						sb.append("\n");
						cnt = 0;
					}
				}
				
			}
			System.out.println("#"+z);
			System.out.println(sb.toString());
		}
	}
}
