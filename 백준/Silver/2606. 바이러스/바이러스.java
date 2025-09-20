import java.io.*;
import java.util.*;

public class Main {
    static int n, m , ans;
    static boolean[] ch;
    static ArrayList<ArrayList<Integer>>graph;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ans = 0;
        ch = new boolean[n+1];
        graph= new ArrayList<>();
        for(int i = 0; i <= n ; i ++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        DFS(1);
        System.out.println(ans);
    }
    static void DFS(int v){
        if (v > n){
            return;
        }else{
            ch[v] = true;
            for (int nx : graph.get(v)) {
                if (!ch[nx]){
                    ans ++;
                    DFS(nx);
                }
            }
        }
    }
}
