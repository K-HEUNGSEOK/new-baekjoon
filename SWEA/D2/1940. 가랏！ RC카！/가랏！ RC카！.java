

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	static int speed;
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int z = 1 ; z<= T; z++) {
			int n = sc.nextInt();
			int car = 0;
			speed = 0;
			
			for(int i = 0 ; i < n ; i ++) {
				int index = sc.nextInt();
				int temp = 0;
				if(index == 1 || index == 2) {
					temp = sc.nextInt();
				}
				sppedControl(index, temp);
				car += speed;
			}
			System.out.println("#"+z+" " + car);
		}
	}
	static void sppedControl(int index, int spd) {
		switch(index) {
		case 1 :
			speed += spd;
			break;
		case 2 :
			speed -= spd;
			if(speed < 0) {
				speed = 0;
			}
			break;
		}
	}
}
