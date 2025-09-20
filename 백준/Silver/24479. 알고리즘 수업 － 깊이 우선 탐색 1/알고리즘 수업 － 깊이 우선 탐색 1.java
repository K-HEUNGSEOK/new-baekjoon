import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    static int n, m ,s , cnt;
    static boolean[] ch;
    static ArrayList<ArrayList<Integer>>graph;
    static StringBuilder sb = new StringBuilder();
    static int[] check;
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        cnt = 1;
        graph = new ArrayList<>();
        for(int i = 0 ; i <=n ; i ++){
            graph.add(new ArrayList<>());
        }
        ch = new boolean[n + 10];
        check= new int[n + 10];
        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for(int i = 1; i <=n ; i++){
            Collections.sort(graph.get(i));
        }

        DFS(s);
        for(int i = 1 ; i <= n ; i ++){
            sb.append(check[i]).append("\n");
        }
        System.out.println(sb);
    }
    static void DFS(int v){
        if (v > n)return;
        else{
            ch[v] = true;
            check[v] = cnt ++;
            for (Integer nx : graph.get(v)) {
                if (!ch[nx]){
                    DFS(nx);
                }
            }
        }
    }
}