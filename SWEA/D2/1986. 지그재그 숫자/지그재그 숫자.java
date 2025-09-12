import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
  
        Scanner sc = new Scanner(System.in);

        //기본 세팅
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
            int ans = 1;
            int n = sc.nextInt();
            for(int i = 2; i <= n ; i ++){
                if (i % 2 == 0){
                    ans -= i;
                }else{
                    ans += i;
                }
            }
            System.out.println("#" + l + " " + ans);
        }
    }
}

