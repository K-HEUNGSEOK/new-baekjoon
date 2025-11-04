

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int z = 1 ; z<= T; z++) {
			int hours1 = sc.nextInt();
			int minutes1 = sc.nextInt();
			
			int hours2 = sc.nextInt();
			int minutes2 = sc.nextInt();
			
			int total = totalMinutes(hours1,minutes1) + totalMinutes(hours2,minutes2);
			
			int hours = total / 60;
			if(hours > 12) {
				hours -= 12;
			}
			int minutes = total % 60;
			
			if(minutes > 59) {
				minutes -= 60;
				hours ++;
			}
		
			System.out.println("#"+z+ " " + hours + " " + minutes);
			
			
		}
	}
	static int totalMinutes(int h, int m) {
		int total = h *= 60;
		return total += m;
	}
}
