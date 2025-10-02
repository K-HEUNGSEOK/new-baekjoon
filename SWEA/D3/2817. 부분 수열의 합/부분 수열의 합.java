import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static int n, k,ans;
    static int[] arr ;
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z = 1 ; z<= T;  z++){
            n = sc.nextInt();
            k = sc.nextInt();
            ans = 0;
            arr = new int[n];
            for(int i = 0 ; i < n ; i++) arr[i] = sc.nextInt();
            DFS(0, 0);
            System.out.println("#" + z + " " + ans);
        }
    }
    static void DFS(int v, int total){
        if(total > k) return;
        if(v == n){
            if(total == k) ans ++;
            return;
        }
        else {
            DFS(v + 1 , total + arr[v]);
            DFS(v + 1 , total);
        }
    }
}


