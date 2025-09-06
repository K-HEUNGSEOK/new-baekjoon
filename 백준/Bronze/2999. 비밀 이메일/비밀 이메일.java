import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        int n = arr.length();

        int r = 0;
        int c = 0;
        for(int i = 1 ; i <= n ; i ++){
            for(int j = i; j <= n ; j ++){
                if (i * j == n){
                    //r 이 젤큰걸로 해야돼
                    if (r < i){
                    r = i;
                    c = j;
                    }
                }
            }
        }

        char[][] message = new char[r][c];
        int index = 0;
        for(int i = 0; i < c; i ++){
            for(int j = 0; j < r; j ++){
                if (index < n ) {
                    message[j][i] = arr.charAt(index);
                }
                index ++;

            }
        }

        for(int i = 0 ; i < r; i ++){
            for(int j= 0 ; j < c; j ++){
                System.out.print(message[i][j]);
            }
        }
    }
}