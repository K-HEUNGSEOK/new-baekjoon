import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    static StringBuilder sb;

    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner sc = new Scanner(System.in);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        char[] alphabet = str.toCharArray();

        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            sb = new StringBuilder();
            char[] target = sc.next().toCharArray();
            for (char c : target) {
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == c) {
                        binaryChange(i);
                    }
                }
            }

            String ans = sb.toString();
            int cnt = 0;
            System.out.print("#" + z + " ");
            for (int i = 0; i < ans.length(); i += 8) {
                String test = ans.substring(i, i + 8);
                System.out.print((char) changeNumber(test));
            }
            System.out.println();
        }
    }

    static int changeNumber(String str) {
        char[] arr = str.toCharArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] - '0';
            total = total * 2 + digit;
        }
        return total;
    }

    static void binaryChange(int num) {
        //2진수로 바꾸려면 2로 다 나누고 뒤집으면됨
        StringBuilder temp = new StringBuilder();
        while (num > 0) {
            temp.append(num % 2);
            num /= 2;
        }
        while (temp.length() < 6) {
            temp.append("0");
        }
        sb.append(temp.reverse().toString());
    }
}
