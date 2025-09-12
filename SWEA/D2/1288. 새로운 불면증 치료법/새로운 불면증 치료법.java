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
            int ans = 0;
            boolean flag = true;
            int n = sc.nextInt();
            int[] arr = new int[10];
            int cnt = 1;
            while (flag) {
                int temp = n * cnt;
             
                fillArray(arr, temp);

                if (check(arr)) {
                    ans = temp;
                    flag = false;
                }

                cnt ++;
            }
            System.out.println("#" + l + " " + ans);
        }
    }
    static boolean check(int [] arr){
        for(int i = 0; i<= 9; i ++){
            if (arr[i] <= 0){
                return false;
            }
        }
        return true;
    }
    static void fillArray(int[] arr, int temp){
        String str = temp + "";

        for(int i = 0 ; i < str.length(); i ++){
            int z = str.charAt(i) - '0';
            arr[z] ++;
        }
    }
}

