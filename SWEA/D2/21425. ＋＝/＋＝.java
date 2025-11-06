

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
			int x = sc.nextInt();
			int y = sc.nextInt();
			int target = sc.nextInt();
			int ans = Integer.MAX_VALUE;
			
			
			int cnt = 0;
			while(Math.max(x, y) <= target) {
				if(x > y) y += x;
				else x += y;
				cnt ++;
			}
			System.out.println(cnt);
			
			
		
		}
	}

}
