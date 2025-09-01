import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.next().toCharArray();
        }
        int width = 0;
        int height = 0;
        for(int i = 0 ; i < n ; i ++){
            int cnt= 0;
            for(int j = 0 ; j < n ; j ++){
                if (arr[i][j] == '.'){
                    cnt ++;
                }else{
                    if (cnt >= 2){
                        width ++;
                    }
                    cnt =0;
                }
            }
            if (cnt >= 2){
                width ++;
            }
        }

        for(int i = 0 ; i < n ; i ++){
            int cnt= 0;
            for(int j = 0 ; j < n ; j ++){
                if (arr[j][i] == '.'){
                    cnt ++;
                }else{
                    if (cnt >= 2){
                        height ++;
                    }
                    cnt =0;
                }
            }
            if (cnt >= 2){
                height ++;
            }
        }
        System.out.println(width + " "  + height);
    }

}