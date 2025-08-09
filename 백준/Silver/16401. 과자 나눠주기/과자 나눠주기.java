import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0 ; i < m ; i ++) arr[i] = sc.nextInt();

        int lt = 0;
        int rt = 1000000001;
        int ans = 0;
        while (lt + 1 < rt){
            int mid = (rt + lt) / 2;

            int cnt = 0;
            for(int i = 0; i < m ; i ++){
                //연속으로 쪼개야 하네
                int temp = arr[i];
                while (mid <= temp){
                    temp -= mid;
                    cnt ++;
                }
            }
            if (cnt >= n){
                ans = Math.max(ans, mid);
                lt = mid;
            }else{
                rt = mid;
            }
        }
        System.out.println(ans);
    }
}