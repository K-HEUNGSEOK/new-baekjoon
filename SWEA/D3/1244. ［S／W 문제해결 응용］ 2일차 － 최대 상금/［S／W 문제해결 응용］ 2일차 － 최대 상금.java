

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	static int cnt, total;
	static char[] arr;
	static boolean[][] visited ;
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int z = 1 ; z<= T; z++) {
			//한번씩 다 바꿔보면서 최대값을 찾는 것 
			
			int n = sc.nextInt();
			arr = (n+"").toCharArray();
			cnt = sc.nextInt();
			visited = new boolean[cnt+1][1000000];
			total = 0;
			DFS(0);
			System.out.println("#"+z+" " + total);
		}
	}
	static void DFS(int c) {
		int currentNumber = Integer.parseInt(new String(arr));
		if(visited[c][currentNumber]) return;
		
		visited[c][currentNumber] = true;
		if(c == cnt) {
			total = Math.max(total, currentNumber);
			return;
		}else {
			for(int i = 0 ; i < arr.length; i ++) {
				for(int j = i + 1; j < arr.length; j ++) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					DFS(c +1);
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
}
