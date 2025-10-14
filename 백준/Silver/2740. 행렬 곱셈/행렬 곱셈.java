
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static final int MAX = 101;
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[MAX][MAX];

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                a[i][j] = sc.nextInt();
            }
        }

        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int[][] b = new int[MAX][MAX];
        for(int i = 0 ; i < n2; i ++){
            for(int j = 0 ; j < m2; j ++){
                b[i][j] = sc.nextInt();
            }
        }
       // n = 3; m2 = 3; m = 2;
        for(int i = 0 ; i < n; i ++){
            for(int j = 0 ; j < m2 ; j ++){
                int sum = 0;
                for(int k = 0; k < m; k ++){
                    sum += a[i][k] * b[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}