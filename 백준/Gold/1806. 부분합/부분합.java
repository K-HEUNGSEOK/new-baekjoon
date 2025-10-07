
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i =1 ; i <= n ; i ++){
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[n+1];
        for(int i = 1 ; i <= n ; i ++){
            prefix[i] = arr[i] + prefix[i-1];
        }

        int rt = 1;
        int lt = 1;
        int ans = Integer.MAX_VALUE;
        int total = 0;

        while(true){
            if(total >= m){
                ans = Math.min(ans , rt - lt);
                total -= arr[lt++];
            }else if(rt > n){
                break;
            }else{
                total += arr[rt ++];
            }
        }
        if(ans == Integer.MAX_VALUE){
            System.out.println(0);
        }else{
            System.out.println(ans);
        }
    }
}