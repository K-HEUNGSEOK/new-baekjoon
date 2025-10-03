import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static int n, ans ;
    static int[] param, arr;
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            n = sc.nextInt();
            ans = -1;
            arr = new int[n];
            for(int i = 0; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            param = new int[2];
            DFS(0, 0);

            System.out.println("#" + z + " " + ans);

        }
    }
    static boolean check(int sum){
        String str = sum + "";
        for(int i = 0 ; i < str.length()-1; i ++){
            if(str.charAt(i)-'0' > str.charAt(i+1) -'0'){
                return false;
            }
        }
        return true;
    }
    static void DFS(int v, int start){
        if(v == 2){
            int sum = param[0] * param[1];
            if(check(sum)){
                ans = Math.max(ans,sum);
            }
        }else{
            for(int i = start; i < n; i ++){
                param[v] = arr[i];
                DFS(v + 1, i + 1);
            }
        }
    }
}


