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
            int[] arr = new int[n+1];
            int m = sc.nextInt();
            for(int i = 1 ; i <= m ; i ++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                for(int j = x; j <= y; j ++){
                    arr[j] = i;
                }
            }

            System.out.print("#" + z + " ");
            for(int i = 1; i <= n ; i ++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();


        }
    }
}


