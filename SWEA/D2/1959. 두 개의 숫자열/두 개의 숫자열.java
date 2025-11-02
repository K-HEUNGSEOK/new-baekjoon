import java.io.FileInputStream;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int z = 1; z <= T; z++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			
			for(int i = 0 ; i < n ; i ++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0 ; i < m ; i ++) {
				b[i] = sc.nextInt();
			}
			int ans = 0 ;
			
			if(n > m) {
				int temp = n;
				n = m;
				m = temp;
				
				int[] arr = a;
				a = b;
				b = arr;
			}
			//여기서 이제 바꿔야한다,
			for(int i = 0 ; i <= m -n; i ++) {
				int total = 0;
				for(int j = 0; j < n ; j ++) {
					int sum = a[j] * b[j + i];
					total += sum;
				}
				ans = Math.max(ans, total);
			}
			System.out.println("#" + z + " " + ans);
		}
	}
}
