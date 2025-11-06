

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
			//1. a는 그가격 그대로
			//2. b는 R 이하면 Q(기본요금) 초과하면 1리터당 Q + S
			//P(1리터당) Q (기본요금) R(R이하면 기본요금) S (초과하면 S만큼) W (내가쓴양) 순으로 
			int p = sc.nextInt();
			int q = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();
			int w = sc.nextInt();
			
			int totalA = p * w;
			int totalB = q;
			if(w > r) {
				int temp = w -= r;
				totalB = s * temp + q;
			}
			
			System.out.println("#"+z+" " +(Math.min(totalA, totalB)));
		}
	}
}
