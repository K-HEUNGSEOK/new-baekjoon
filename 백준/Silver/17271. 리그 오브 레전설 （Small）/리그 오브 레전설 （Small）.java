import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    static long []dp;
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        dp = new long[n+1];
        dp[0] = 1;
        
        for(int i = 1 ; i <= n ; i ++){
            if (i < m){
                dp[i] = dp[i-1] % 1000000007;
            }else{
                dp[i] = (dp[i -m] + dp[i -1]) % 1000000007;;
            }
        }
        System.out.println(dp[n]);
    }
}