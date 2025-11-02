import java.io.FileInputStream;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int z = 1; z <= T; z++) {
			String str = sc.next();
			int ans = 0;
			
			for(int i = 1; i <= 10; i ++) {
				String temp = str.substring(0, i);
				String target = str.substring(i, i * 2);
				if(target.equals(temp)) {
					ans = Math.max(ans, temp.length());
					break;
				}
			}
			System.out.println("#" + z + " " + ans);
		}
	}
}
