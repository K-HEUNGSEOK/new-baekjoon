import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int N = sc.nextInt();
        int[] cake = new int[L +1];
        int first = 0; //가장 많이 받을거같은애
        int fCurrent = 0;

        int second = 0; //실제로 많이 받은애
        int current = 0 ; //번호
        for(int i = 1 ; i <= N; i ++){
            int p = sc.nextInt();
            int k = sc.nextInt();
            if (k - p + 1 > fCurrent){
                fCurrent = k - p + 1;
                first = i;
            }

            int cnt = 0;
            for(int j = p ; j <= k ; j ++){
                if (cake[j] != 0) continue;
                cake[j] ++;
                cnt ++;
            }

            if (current < cnt){
                current = cnt;
                second = i;
            }
        }
        System.out.println(first);
        System.out.println(second);

    }
}