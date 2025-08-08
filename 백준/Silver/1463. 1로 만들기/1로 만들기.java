import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        //1 + 2 + 3 으로 만들 수 있는 수의 갯수
        int n = sc.nextInt();
        //x 가 3으로 나누어 떨어지면 3으로 나누고
        //2로 나누어 떨어지면 2로 나누고
        //1을 빼고
        //3가지 연산을 적절히 사용해서 1을 만들려고 하는데 연산을 사용하는 횟수의 최소값

        int[] dp = new int[n+1];
        if (n == 1){
            System.out.println(0);
            return;
        }
        if (n <= 3){
            System.out.println(1);
            return;
        }
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        //4는 1을 빼고 3으로 나눠도 되고
        //2를 나누고 1을 빼도 되고
        //2를 2번 나눠도 된다.
        for(int i = 4; i <= n ; i ++){
            int first = dp[i-1] + 1;
            int second = Integer.MAX_VALUE;
            int third = Integer.MAX_VALUE;
            if (i % 2 == 0){
               second = dp[i/2] + 1;
            }
            if (i % 3 == 0){
                third = dp[i/3] + 1;
            }
            dp[i] = Math.min(first, Math.min(second,third));
        }
        System.out.println(dp[n]);
    }
}