import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int[] arr = new int[10];
            for(int i = 0 ; i < 10; i ++){
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            for(int i = 0 ; i < 10 ; i ++){
                if (arr[i] % 2 == 1){
                    ans += arr[i];
                }
            }

            System.out.println("#" + z + " " + ans );
        }
    }
}


