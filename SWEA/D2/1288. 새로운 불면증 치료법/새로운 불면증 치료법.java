

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
	static int ans;
	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int z = 1; z <= T; z ++) {
			boolean[] arr = new boolean[10];
			
			int n = sc.nextInt();
			int temp = n;
			int ans = 0;
			int cnt= 2;
			while(true) {
				ans ++;
				char[] number = (temp+"").toCharArray();
				
				for(char c : number) {
					int index = c -'0';
					arr[index] = true;
				}
				
				boolean flag = true;
				for(int i = 0 ; i < 10; i ++) {
					if(!arr[i]) {
						flag = false;
						break;
					}
				}
				if(flag) {
					break;
				}
				temp = n * cnt;
				cnt ++;
			}
			System.out.println("#" + z + " " + temp);
		}
	}
}
