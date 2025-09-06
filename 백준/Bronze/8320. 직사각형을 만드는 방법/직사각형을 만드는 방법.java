import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        //높이
        for(int i = 1; i <= n ; i++){
            //너비
            for(int j = i; j <= n; j ++){
                if (i * j <= n) cnt ++;
                else break;
            }
        }
        System.out.println(cnt);
    }
}