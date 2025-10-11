import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int[] arr = new int[101];
            int f = sc.nextInt();
            for(int i = 0 ; i < 1000; i ++){
                int num = sc.nextInt();
                arr[num] ++;
            }
            int ans = 0;
            int index = 0 ;
            for(int i = 0 ; i <= 100; i ++){
                if(arr[i] >= ans){
                    ans = arr[i];
                    index = i;
                }
            }
            System.out.println("#" + z +" " + index);
        }
    }
}


