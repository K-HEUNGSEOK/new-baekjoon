import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {
	static char[] arr = {'3','6','9'};
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
	

		
			int n = sc.nextInt();
			
		
			for(int i = 1; i <= n; i ++) {
				char[] str = (i +"").toCharArray();
				int cnt = 0;
				for(int j = 0 ; j <str.length; j ++) {
					char temp = str[j];
					
					for(int k = 0 ; k < 3; k ++) {
						if(temp == arr[k]) {
							cnt ++;
						}
					}
				
				}
				
				if(cnt == 0) {
					System.out.print(i + " ");
				}else {
					for(int j = 0 ; j < cnt ; j ++) {
						System.out.print("-");
					}
					System.out.print(" ");
				}
			}
		
	}
}
