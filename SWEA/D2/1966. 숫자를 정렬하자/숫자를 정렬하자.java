import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
 
        Scanner sc = new Scanner(System.in);

        //기본 세팅
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.print("#" + l + " " );
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

