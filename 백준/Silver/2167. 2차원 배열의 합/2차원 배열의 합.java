import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n+1][m+1];
        for(int i = 1; i <= n ; i ++){
            for(int j = 1; j <= m ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        for(int z = 0 ; z < k; z ++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int sum = 0;
            for(int i = x1 ; i <= x2; i ++){
                for(int j = y1 ; j <= y2 ; j ++){
                    sum += arr[i][j];
            }
        }
            System.out.println(sum);
    }
    }
}