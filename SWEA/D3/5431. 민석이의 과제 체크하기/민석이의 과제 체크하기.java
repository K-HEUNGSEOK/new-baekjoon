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
            int k = sc.nextInt();
            boolean[] arr = new boolean[101];
            for(int i = 0 ; i < k; i ++){
                int index = sc.nextInt();
                arr[index] = true;
            }

            System.out.print("#" + z + " ");
            for(int i = 1; i <= n ; i ++){
                if(!arr[i]){
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        }
    }
}


