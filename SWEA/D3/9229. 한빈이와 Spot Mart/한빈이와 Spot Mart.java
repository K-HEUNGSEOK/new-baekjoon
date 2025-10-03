import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static int ans, n;
    static int[] snack;
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            n = sc.nextInt();
            int m = sc.nextInt();
            snack = new int[n];
            for(int i = 0 ; i < n ; i ++){
                snack[i] = sc.nextInt();
            }
            ans = -1;

            for(int i = 0 ; i < n ; i ++){
                int total = snack[i];
                for(int j = i+1 ; j < n ; j ++){
                    if(total + snack [j] <= m){
                        ans = Math.max(ans, total + snack[j]);
                    }
                }
            }

            System.out.println("#" + z + " " + ans);
        }
    }

}


