import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }

            long ans = 0;
            long price = arr[n-1];
            for(int i = n-1; i > 0; i --){
                if(price > arr[i-1]){
                    ans += price - arr[i-1];
                }else{
                    price = arr[i-1];
                }
            }
            System.out.println("#" + z + " " + ans);
        }
    }
}


