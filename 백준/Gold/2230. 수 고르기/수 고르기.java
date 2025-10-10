
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);


        int lt = 0;
        int rt = 0;

        long ans = Long.MAX_VALUE;
        while (rt < n && lt <= rt) {
            long diff = arr[rt] - arr[lt];
            if(diff < m){
                rt ++;
            }else{
                ans = Math.min(ans,diff);
                lt ++;
                if(lt > rt){
                    rt = lt;
                }
            }
        }
        System.out.println(ans);
    }
}