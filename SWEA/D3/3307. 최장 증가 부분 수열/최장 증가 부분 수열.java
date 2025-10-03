import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            int[] dp = new int[n];
            dp[0] = 1;
            for(int i = 1; i < n ; i++){
                int max = 0;
                for(int j = i -1; j >= 0; j --){
                    if(arr[i] > arr[j]){
                        max = Math.max(max, dp[j]);
                    }
                }
                dp[i] = max + 1;
            }
            int ans = 0;
            for(int nx : dp){
                ans = Math.max(ans,nx);
            }
            System.out.println("#" + z + " " + ans);
        }
    }
}


