import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    static int n,k;
    static int[] arr;
    static int ans ;
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z = 1 ; z <= T ; z++){
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];
        ans = 0;
        for(int i = 0; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        DFS(0,0);
        System.out.println("#" + z + " "  + ans);
        }
    }
    static void DFS(int v, int total){
        if (total > k) return;
        if (total == k){
            ans ++;
            return;
        }
        if (v == n){
            return;
        }else{
            DFS(v + 1, total + arr[v]);
            DFS(v + 1, total);
        }
    }
}

