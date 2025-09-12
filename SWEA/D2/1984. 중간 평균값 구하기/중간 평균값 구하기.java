import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        //기본 세팅
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
            int[] arr = new int[10];
            for(int i = 0 ; i < 10 ; i ++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            double total = 0 ;
            for(int i = 1; i < 10-1; i ++){
                total += arr[i];
            }
            int ans = (int) Math.round(total / 8);

            System.out.println("#" + l + " " + ans);
        }
    }
}

