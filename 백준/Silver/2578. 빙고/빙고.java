
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n = 5;
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int cnt = 1;
        for(int i = 0 ; i < n * n ; i ++){
            int num = sc.nextInt();

            for(int j = 0 ; j < n ; j ++){
                for(int k = 0 ; k < n; k ++){
                    if(arr[j][k] == num){
                        arr[j][k] = 0;
                        if(check(arr)){
                                System.out.println(i + 1);
                                return;
                        }
                    }
                }
            }

        }
    }
    static void print(int[][] arr){
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static boolean check(int[][] arr){
        int cnt = 0;
        for(int i = 0 ; i < n; i ++){
            boolean flag = true;
            for(int j = 0 ; j < n ; j ++){
                if(arr[i][j] != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                cnt ++;
            }
        }
        if(cnt >= 3) return true;

        for(int i = 0 ; i < n ; i ++){
            boolean flag = true;
            for(int j = 0 ; j < n ; j ++){
                if(arr[j][i] != 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                cnt ++;
                if(cnt >= 3) return true;
            }
        }

        boolean flag = true;
        for(int i = 0 ; i < n ; i ++){
            if(arr[i][i] != 0){
                flag = false;
                break;
            }
        }
        if(flag){
            cnt ++;
            if(cnt >=3) return true;
        }

        boolean flag2 = true;
        for(int i = 0 ; i < n ; i ++){
            if(arr[i][n-i-1] != 0){
                flag2 = false;
                break;
            }
        }
        if(flag2){
            cnt ++;
            if(cnt >=3) return true;
        }
        return false;

    }
}