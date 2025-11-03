

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	static int ans;
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int z = 1; z <= T; z ++) {
			int n = sc.nextInt();
			int total = 0;
			
			total = IntStream.rangeClosed(1, n).map(i -> i % 2 == 0 ? -i : i).sum();
			
			System.out.println("#" + z + " " + total);
		}
	}
	
}
