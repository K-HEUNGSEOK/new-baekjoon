import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
  
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int z = 1 ; z <= T ; z ++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0 ; i < n; i ++){
                for(int j = 0 ; j < n ; j ++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int ans = 0 ;

            for(int i = 0 ; i < n ; i ++){
                int cnt = 0;
                for(int j = 0 ; j < n ; j ++){
                    if(arr[i][j] == 1){
                        cnt ++;
                    }else{
                        if(cnt == m) ans ++;
                        cnt = 0;
                    }
                }
                if(cnt == m){
                    ans ++;
                }
            }
            for(int i = 0 ; i < n ; i ++){
                int cnt = 0;
                for(int j = 0 ; j < n ; j ++){
                    if(arr[j][i] == 1){
                        cnt +=1;
                    }else{
                        if(cnt == m) ans ++;
                        cnt = 0;
                    }
                }
                if(cnt == m){
                    ans ++;
                }
            }
            System.out.println("#" + z + " " + ans);

        }
    }
}


