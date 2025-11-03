
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
	static int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
	static int[] arr;
	 public static void main(String[] args) throws FileNotFoundException {
		   
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int z = 1; z <= T ; z ++) {
		    	
		    	//입력
		    	int n = sc.nextInt();
		    	arr = new int[8];
		    	
		    	
		    	//주요 로직
		    	DFS(0, n);
		    	
		    	//출력
		    	System.out.println("#" + z);
		    	Arrays.stream(arr).forEach(index -> System.out.print(index + " "));
		    	System.out.println();
		    }
	 }
	 static void DFS(int v, int n) {
		 if(v == 8) {
			 return;
		 }else {
			if(n >= money[v]) {
				arr[v] = n / money[v];
				DFS(v, n % money[v]);
			}else {
				DFS(v+1, n);
			}
		 }
	 }
}
