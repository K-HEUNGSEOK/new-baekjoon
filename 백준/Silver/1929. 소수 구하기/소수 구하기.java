import javax.swing.*;
import java.io.*;

import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(java.lang.String[] args) throws IOException {
       
   //     Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        boolean[] prime = new boolean[end + 1];
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i * i <= end; i ++){
            if (!prime[i]){
                for(int j = i * i ; j <= end; j +=i){
                    prime[j] = true;
                }
            }
        }
        for(int i = start; i <= end; i ++){
            if (!prime[i]){
                bw.write(i + "\n");
            }
        }
        bw.flush();

    }
}