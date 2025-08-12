import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1){
            System.out.println(1);
            return;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 3;
        for(int i = 3; i <= n ; i++){
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }
        System.out.println(dp[n]);
    }
}