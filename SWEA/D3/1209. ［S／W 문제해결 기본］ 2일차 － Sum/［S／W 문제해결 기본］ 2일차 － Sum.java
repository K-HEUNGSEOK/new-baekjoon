import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    static int n = 100;
    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner sc = new Scanner(System.in);
        //기본 세팅
        int T = 10;
        for (int l = 1; l <= T; l++) {
            int s = sc.nextInt();
            int[][] box = new int[n][n];
            int ans = 0;
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    box[i][j] = sc.nextInt();
                }
            }
            //각 행 열 대각선

            //1. 가로 세로
            for(int i = 0 ; i < n ; i ++){
                int cnt1 = 0; //가로
                int cnt2  = 0 ; //세로
                for(int j = 0 ; j < n ; j ++){
                    cnt1 += box[i][j];
                    cnt2 += box[j][i];
                }
                int max = Math.max(cnt1,cnt2);
                ans = Math.max(ans,max);
            }
            //2. 대각선
            int a =0;
            int b= 0;
            for(int i = 0 ; i < n ; i ++){
                a += box[i][i];
                b += box[i][n-i-1];
            }
            a  = Math.max(a,b);
            ans = Math.max(ans,a);
            System.out.println("#" + l  +" " + ans);

        }
    }
}

