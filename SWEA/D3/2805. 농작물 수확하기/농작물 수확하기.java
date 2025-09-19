import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    static int[] num = new int[50];
    static int cnt = 1;
    public static void main(String[] args) throws FileNotFoundException {
  
        Scanner sc = new Scanner(System.in);
        //기본 세팅
        for(int i = 3; i <= 49; i += 2){
            num[i] = cnt ++;
        }
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
            int n = sc.nextInt();
            if (n == 1){
                System.out.println("#" + l  +" " + sc.next());
                continue;
            }
            //인덱스 미리 저장해놓기 (3 은 1 5 는 2 이런식임)

            int [][] arr = new int[n][n];
            for(int i = 0 ; i < n ; i ++){
                String str = sc.next();
                for(int j = 0 ; j < n ; j ++){
                    arr[i][j] = str.charAt(j) -'0';
                }
            }
            int ans = 0;
            int middle = n / 2;
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    if (isCheck(i,j,middle,middle,num[n])){
                        ans += arr[i][j];
                    }
                }
            }

            System.out.println("#" + l  +" " + ans);
        }
    }
    static boolean isCheck(int x, int y, int middleX, int middleY, int number){
        int total = Math.abs(x - middleX) + Math.abs(y - middleY);
        return number >= total;
    }
}

