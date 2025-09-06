import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] param;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        param = new int[m];
        DFS(0);
        System.out.println(sb.toString());
    }

    static void DFS(int v) {
        if (v == m) {
            for (int i = 0; i < m; i++) {
                sb.append(param[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 1; i <= n; i++) {
                param[v] = i;
                DFS(v + 1);
            }
        }
    }
}