import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    static StringBuilder sb;

    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int ans = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for(int i = 0 ; i < n ; i ++){
                int cnt = 0;
                for(int j = 0 ; j < n ; j ++){
                    if (arr[i][j] == 1) cnt ++;
                    else {
                        if (cnt == k){
                            ans ++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == k) {
                   ans ++;
                }
            }

            for(int i = 0 ; i < n ; i ++){
                int cnt = 0;
                for(int j = 0 ; j < n ; j ++){
                    if (arr[j][i] == 1) cnt ++;
                    else {
                        if (cnt == k){
                            ans ++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == k) {
                    ans ++;
                }
            }


            //1.먼저 1일때 를 센다. 열과 행을 이때 cnt가 하나라도 k개와 같다면 ans 를 올리는 것
            System.out.println("#" + z + " " + ans);
        }
    }
}
