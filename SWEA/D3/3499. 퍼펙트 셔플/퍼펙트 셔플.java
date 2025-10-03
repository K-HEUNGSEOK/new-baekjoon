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
            String[] arr = new String[n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.next();
            }
            int slice = 0;
            if(n % 2 == 0){
                slice = n/2;
            }else{
                slice = n/2+1;
            }
            String[] copy1 = Arrays.copyOf(arr, slice);
            String[] copy2 = new String[n/2];
            int index = slice;
            for(int i = 0; i < n /2 ; i ++){
                copy2[i] = arr[index++];
            }

            StringBuilder sb = new StringBuilder();


            if(n % 2 == 0){
            for(int i = 0 ; i < slice; i ++){
                sb.append(copy1[i]).append(" ").append(copy2[i]).append(" ");
            }
            }else{
                for(int i = 0 ; i < slice-1; i ++){
                    sb.append(copy1[i]).append(" ").append(copy2[i]).append(" ");
                }
                sb.append(copy1[slice-1]).append(" ");
            }
            System.out.println("#" + z + " " + sb.toString());
        }
    }
}


