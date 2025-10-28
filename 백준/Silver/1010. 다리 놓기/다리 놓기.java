
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
public class Main {
	static int[][] memorization;
	static int MAX = 31;
	public static void main(String args[]) throws Exception{
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n ; i ++) {
			memorization = new int[MAX][MAX];
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(combination(b,a));
		}
		
		
	}
	static int combination(int n, int r) {
		if(memorization[n][r] != 0) return memorization[n][r];
		if(n == r || r == 0) {
			return 1;
		}else {
			return memorization[n][r] = combination(n-1,r-1) + combination(n-1,r);
		}
	}
}
