
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        for(int j = 4 ; j < 101; j ++){
            arr[j] = arr[j-3] + arr[j-2];
        }
        for(int i = 0 ; i < n ; i ++){
            int find = sc.nextInt();
            System.out.println(arr[find]);
        }
    }
}