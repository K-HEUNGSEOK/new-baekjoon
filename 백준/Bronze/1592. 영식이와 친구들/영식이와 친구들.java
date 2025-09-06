import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int index = 0;
        int ans = 0;
        boolean flag = true;
        while (flag){
         arr[index] ++;
         if (arr[index] % 2 != 0){
             index = (index + k) % n;
         }else{
             index = ((index - k) + n) % n;
         }

         ans ++;
         for(int i = 0 ; i < n ; i ++){
             if (arr[i] >= m){
                 flag = false;
                 break;
             }
         }
        }
        System.out.println(ans-1);
    }
}