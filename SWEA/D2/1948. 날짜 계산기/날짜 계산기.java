

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int z = 1 ; z<= T; z++) {
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();
			
			int month2 = sc.nextInt();
			int day2 = sc.nextInt();
			
			int totalA = totalDay(month1, day1);
			int totalB = totalDay(month2, day2);
			System.out.println("#"+ z+ " " + (totalB - totalA + 1));
		}
	}
	static int totalDay(int month, int day) {
		int total = 0;
		for(int i = 0 ; i < month-1; i ++) {
			total += days[i];
		}
		total += day;
		return total;
	}
}
