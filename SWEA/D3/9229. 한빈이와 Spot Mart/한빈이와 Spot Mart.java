import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static int ans, n,m;
    static int[] snack;
    static int[] param;
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            n = sc.nextInt();
            m = sc.nextInt();
            snack = new int[n];
            for(int i = 0 ; i < n ; i ++){
                snack[i] = sc.nextInt();
            }
            ans = -1;
            param = new int[2];
            DFS(0,0);

            System.out.println("#" + z + " " + ans);
        }
    }
    static void DFS(int v, int start){
        if(v == 2){
            int sum = param[0] + param[1];
            if(sum > m) return;
            if(ans > sum) return;
            ans = sum;
        }else{
            for(int i = start; i < n ; i++){
                param[v] = snack[i];
                DFS(v + 1, i+1);
            }
        }
    }
}


