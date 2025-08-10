import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    static int n, m, ans, index;
    static List<Integer>[] list;
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ans = Integer.MAX_VALUE;
        index = -1; //정답자 번호
        list = new List[n + 1];
        for(int i = 0 ; i <= n ; i ++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        for(int i = 1; i<= n ; i ++){
            BFS(i);
        }
        System.out.println(index);
    }
    static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        boolean[] ch = new boolean[n + 1];
        ch[v] = true;
        int[] dist = new int[n + 1];
        int level = 1;
        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0 ; i < len ; i++){
                Integer num = queue.poll();
                for (int nx : list[num]) {
                    if (!ch[nx]){
                        ch[nx] = true;
                        dist[nx] = level;
                        queue.offer(nx);
                    }
                }
            }
            level ++;
        }
        if (getTotal(dist) < ans){
        ans = Math.min(ans, getTotal(dist));
        index = v;
        }
    }
    static int getTotal(int[] dist){
        int total = 0;
        for (int i : dist) {
            total += i;
        }
        return total;
    }
}