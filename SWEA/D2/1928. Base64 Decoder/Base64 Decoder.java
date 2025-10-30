import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		char[] alphabet = s.toCharArray();
		// 1. 표1을 보고 입력받은 문자들을 각각 대응하는 숫자로 변경한다.
		// 2. 각 숫자들을 6자리 이진수로 표현하고, 이 이진수들을 한 줄로 쭉 이어 붙인다.
		// 3. 한 줄로 쭉 이어붙인 이진수들을 8자리씩 끊어서 십진수로 바꾼다.
		// 4. 각각의 십진수를 아스키 코드로 변환한다.

		for (int z = 1; z <= T; z++) {
			String str = sc.next();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				char temp = str.charAt(i);

				for (int j = 0; j < alphabet.length; j++) {
					if (temp == alphabet[j]) {
						String binary = Integer.toBinaryString(j);
						String format = String.format("%6s", binary).replace(" ", "0");
						sb.append(format);
					}
				}
			}
			String temp = sb.toString();
			System.out.print("#" + z + " ");
			for(int i = 0 ; i < sb.length(); i +=8) {
				String slice = temp.substring(i,i+8);
				System.out.print((char)Integer.parseInt(slice,2));
			}
			System.out.println();
		}
	}
}
