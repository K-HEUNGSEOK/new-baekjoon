import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for(int i = 1 ; i <= n ; i ++) arr[i] = sc.nextInt();

        dp[1] = arr[1];
        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }
        for(int i = 3; i <= n ; i ++){
            //1에서 3으로 온경우
            int first = dp[i-2] + arr[i];
            //0칸에서 2칸 + 1 칸으로 온 경우
            int second = dp[i-3] + arr[i-1] + arr[i];
            dp[i] = Math.max(first,second);
        }
        System.out.println(dp[n]);
    }
}