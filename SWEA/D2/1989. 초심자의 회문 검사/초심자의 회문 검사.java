import java.io.FileInputStream;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int z = 1; z <= T; z++) {
			String str = sc.next();
			
			boolean flag = true;
			for(int i = 0 ; i < str.length(); i ++) {
				if(str.charAt(i) != str.charAt(str.length()-1-i)) {
					flag = false;
					break;
				}
			}
			
			System.out.print("#" + z + " ");
			System.out.println(flag ? 1 : 0);
		}
	}
}
