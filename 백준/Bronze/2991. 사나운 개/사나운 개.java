import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for(int i = 0 ; i < 3; i ++){
            int n = sc.nextInt();
            int cnt = 0;
            int fdog = n % (a + b);
            int sdog = n % (c + d);

            if (fdog <= a && sdog <= c){
                cnt = 2;
            }else if (fdog <= a || sdog <= c){
                cnt = 1;
            }

            if (fdog == 0) cnt -=1;
            if (sdog ==0) cnt -=1;
            System.out.println(cnt);
        }

    }
}