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
        for(int z = 1; z <= T; z ++){
            char[] target = sc.next().toCharArray();
            //1.그 숫자들을 다 2진수로 바꿔라
            //2.2진수로 바꾼애들을 8개씩 짤라서 10진수로 바꿔서 변환해라
            sb = new StringBuilder();
            for (char c : target) {
                for(int i = 0 ; i < alphabet.length; i ++){
                    if (alphabet[i] == c){
                        //이때 꼭 6자리가 될 수 있게 채워줘야 한다.
                        String binaryString = Integer.toBinaryString(i);
                        String finalString = String.format("%6s", binaryString).replace(' ', '0');
                        sb.append(finalString);
                    }
                }
            }
            //2진수 다 넣었으면 이제 8자리씩 10진수로 변환
            System.out.print("#" + z  + " ");
            String ans = sb.toString();
            for(int i = 0 ; i < ans.length(); i +=8){
                String temp = ans.substring(i, i+8);
                System.out.print((char)Integer.parseInt(temp,2));
            }
            System.out.println();
        }
    }
}
