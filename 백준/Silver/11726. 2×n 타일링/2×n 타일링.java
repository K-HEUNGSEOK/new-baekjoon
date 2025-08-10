import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] dp = new int[1001];
        int division = 10007;

        dp[1] = 1;
        dp[2] = 2;
        if (n < 3){
            System.out.println(dp[n]);
            return;
        }

        for(int i = 3; i <= n; i ++){
            dp[i] = (dp[i-1] + dp[i-2]) % division;
        }
        System.out.println(dp[n]);
    }
}