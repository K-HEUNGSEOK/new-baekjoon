import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(java.lang.String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int[] alphabet = new int[26];

        for (char c : arr) {
            int num = c - 65;
            alphabet[num] ++;
        }

        int cnt = 0;

        // 홀수인 알파벳이 2개 이상이면 펠린드롬을 만들 수없음
        for (int n : alphabet) {
            if (n % 2 != 0){
                cnt ++;
                if (cnt >= 2){
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        //먼저 앞부분 채우기
        //홀수를 기억해놓자
        int index = 0;
        boolean flag = false;
        for(int i = 0 ; i < 26; i ++){
            if (alphabet[i] > 0){
                if (alphabet[i] % 2 != 0) {
                    index = i;
                    flag = true;
                }

                int num = alphabet[i] / 2;
                for(int j = 0; j < num; j ++){
                    sb.append((char)(i + 65));
                }
                alphabet[i] = num;
            }
        }
        StringBuilder right = new StringBuilder(sb);
        String string = right.reverse().toString();
        if (flag){
        sb.append((char) (index + 65));
        }
        sb.append(string);
        System.out.println(sb);


    }
}