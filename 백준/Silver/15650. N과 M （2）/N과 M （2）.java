import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] param;
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        param = new int[m];
        DFS(0, 1);
    }

    static void DFS(int v, int start) {
        if (v == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(param[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i <= n; i++) {
                param[v] = i;
                DFS(v + 1, i+1);
            }
        }
    }
}