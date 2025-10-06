
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();

        long total = 0;
        for(int i = 0 ; i < k-1; i ++){
            total += arr[i];
        }
        long ans = 0;
        for(int i = k-1 ; i < n ; i ++){
            total += arr[i];
            ans = Math.max(ans,total);
            total -= arr[i-k+1];
        }
        System.out.println(ans);
    }
}