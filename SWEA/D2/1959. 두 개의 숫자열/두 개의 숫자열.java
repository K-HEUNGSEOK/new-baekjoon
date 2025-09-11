import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int l = 1 ; l <= T; l ++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            int max = 0;
            int big = Math.max(n,m);
            int small = Math.min(n,m);
            //3번 반복
            for (int z = 0; z <= big - small; z++) {
                int[] arr = new int[small];
                for (int i = 0; i < small; i++) {
                    if (big == m){
                    int num = a[i] * b[i + z];
                    arr[i] = num;
                    }else{
                        int num = a[i+z] * b[i];
                        arr[i] = num;
                    }
                }
                int total = 0;
                for (int i : arr) {
                    total += i;
                }
                max = Math.max(max, total);
            }
            System.out.print("#" + l + " ");
            System.out.println(max);
        }
    }
}
