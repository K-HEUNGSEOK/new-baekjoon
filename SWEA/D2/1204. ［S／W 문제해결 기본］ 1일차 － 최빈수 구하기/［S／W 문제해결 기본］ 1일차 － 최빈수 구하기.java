
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
public class Solution {
	static int n, cnt;
	static int[] arr;
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int z = 1 ; z <= T ; z ++) {
			int trash = sc.nextInt();
			int[] arr = new int[101];
			
			for(int i = 0 ; i < 1000; i ++) {
				int num = sc.nextInt();
				arr[num] ++;
			}
			
			int maxNum = 0;
			int maxIndex = 0;
			
			for(int i = 1; i <= 100; i ++) {
				if(arr[i] >= maxIndex) {
					maxNum = Math.max(maxNum, i);
					maxIndex = Math.max(maxIndex, arr[i]);
				}
			}
			
			System.out.println("#" + z + " " + maxNum);
		}
	}
}
