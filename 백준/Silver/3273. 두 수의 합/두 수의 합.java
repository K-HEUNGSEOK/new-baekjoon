import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int N = Integer.parseInt(br.readLine());
       int [] a = new int[N];
       String str = br.readLine();
        String[] split = str.split(" ");

        int X = Integer.parseInt(br.readLine());
        for(int i = 0 ; i <N; i ++){
            a[i] = Integer.parseInt(split[i]);
        }

        boolean[] exist = new boolean[1000001];

        for(int i = 0 ; i < N; i ++){
            exist[a[i]] = true;
        }

        int ans = 0;

        for(int i = 0 ; i < N; i ++){
            int value = X - a[i];
            if (0 <= value && value <= 1000000){
                ans += exist[value] ? 1 : 0 ;
            }
        }
        bw.write(ans / 2 + " ");
        bw.flush();

    }

}
