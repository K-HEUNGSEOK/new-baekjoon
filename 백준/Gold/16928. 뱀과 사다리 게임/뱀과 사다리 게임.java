import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

public class Main {
    static int[] graph = new int[101];
    static int[] dist = new int[101];
    static boolean[] ch = new boolean[101];
    static int ans, n, m;
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         ans = 1;
         Arrays.fill(graph,-1);
        for(int i = 0 ; i < n + m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a] = b;
        }
        BFS(1);
    }
    static void BFS(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        ch[x] = true;
        while (!queue.isEmpty()){
            int poll = queue.poll();
            for(int i = 1; i <= 6 ; i ++){
                int next = poll + i;
                if (next > 100) continue;

                if (graph[next] != -1){
                    next = graph[next];
                }

                if (!ch[next]){
                    ch[next] = true;
                    dist[next] = dist[poll] + 1;
                    queue.offer(next);

                }
                if (next == 100){
                    System.out.println(dist[100]);
                    return;
                }

            }
        }
    }
}