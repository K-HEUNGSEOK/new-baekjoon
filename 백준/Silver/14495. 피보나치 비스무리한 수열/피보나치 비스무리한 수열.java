import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static long[] pibo;
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pibo = new long[117];
        DFS(n);
        System.out.println(pibo[n]);
    }
    static long DFS(int v){
        if (pibo[v] != 0) return pibo[v];
        if (v == 1) return pibo[v] = 1;
        if (v == 2) return pibo[v] = 1;
        if (v == 3) return pibo[v] = 1;

        return pibo[v] = DFS(v-1) + DFS(v -3);
    }
}