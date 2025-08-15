import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    static int n, k;
    static int[] dp;
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < n ; i++){
            if (i + 1 <= n ){
                dp[i+1] = Math.min(dp[i] + 1, dp[i+1]);
            }
            if (i + i/2 <= n){
                dp[i+ i/2] = Math.min(dp[i+i/2], dp[i] + 1);
            }
        }

        if (dp[n] <= k){
            System.out.println("minigimbob");
        }else{
            System.out.println("water");
        }
    }
}