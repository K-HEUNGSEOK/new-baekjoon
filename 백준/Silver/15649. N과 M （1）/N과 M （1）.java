import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] param;
    static boolean [] ch;
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        param = new int[m];
        ch = new boolean[n+1];
        DFS(0);
    }
    static void DFS(int v){
        if (v == m){
            for(int i = 0 ; i < m ; i ++){
                System.out.print(param[i] + " ");
            }
            System.out.println();
        }else{
            for(int i = 1; i<= n; i ++){
                if (!ch[i]){
                    ch[i] = true;
                param[v] = i;
                DFS(v + 1);
                ch[i] = false;
                }
            }
        }
    }
}