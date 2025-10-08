
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 1;
        for(int i = 0 ; i < n ; i ++){
            int temp = arr[i];
            int cnt = 1;
            for(int j = i +1; j < n ; j ++){
                if(arr[j] < temp + 5){
                    cnt ++;
                }
            }
            ans = Math.max(ans,cnt);
        }
        System.out.println(5-ans);
    }
}