

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	static int[] cal;
	static int[] flavor;
	static int ans, limit,n;
	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int z = 1; z <= T; z++) {
			n = sc.nextInt();
			limit = sc.nextInt();
			ans = 0;
			cal = new int[n];
			flavor = new int[n];
			
			for(int i = 0 ; i < n ; i++) {
				flavor[i] = sc.nextInt();
				cal[i] = sc.nextInt();
			}
			
			//limit 를 넘지 않으면서 맛의 점수가 가장 높은 것 
			DFS(0,0,0); //index, 맛의 점수, 칼로리 
			System.out.println("#" + z + " " +ans);
		}
	}
	static void DFS(int v, int num, int c) {
		if(c > limit) return;
		if(v == n) {
			if(ans > num) return;
			ans = Math.max(ans, num);
			
		}else {
			DFS(v+1, num + flavor[v], c + cal[v]);
			DFS(v+1, num, c);
		}
	}
}