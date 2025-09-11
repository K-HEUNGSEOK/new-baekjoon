import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.util.*;

public class Solution {
    static int[] a,b;
    public static void main(String[] args) throws FileNotFoundException {
  
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int l = 1 ; l <= T; l ++) {
            int max = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            a = new int[n];
            b = new int[m];
            for(int i = 0 ; i < n ; i ++) a[i] = sc.nextInt();
            for(int i = 0 ; i < m ; i ++) b[i] = sc.nextInt();

            //짧은 배열은 무조건 a다
            if (n > m){
                int [] tempArr = a;
                a = b;
                b = tempArr;

                int temp = n;
                n = m;
                m = temp;
            }


            for(int z = 0 ; z <= m - n; z ++){
                int total = 0;
                for(int i = 0 ; i < n ; i ++){
                    total += a[i] * b[i+z];
                }
                max  = Math.max(max,total);
            }
            //결과 호출
            System.out.print("#" + l +" ");
            System.out.println(max);
        }
    }

}
