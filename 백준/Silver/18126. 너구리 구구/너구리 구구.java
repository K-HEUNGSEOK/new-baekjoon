import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    static List<Edge>[] graph;
    static boolean[] ch;
    static int n;
    static long ans;
    static int[] direct;
    public static void main(java.lang.String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new List[n+1];
        ch = new boolean[n+1];
        direct = new int[n + 1];
        for(int i = 0 ; i <= n ; i ++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < n -1; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a].add(new Edge(b,c));
            graph[b].add(new Edge(a,c));
        }
        ans = 0;
        BFS(1);
        System.out.println(ans);

    }
    static void BFS(int v){
        Queue<Edge> queue = new LinkedList<>();
        queue.offer(new Edge(v,0));
        ch[v] = true;
        while (!queue.isEmpty()){
            Edge poll = queue.poll(); // 1 이랑 0 이나옴
            ans = Math.max(ans, poll.cost);
            for (Edge cost : graph[poll.vex]) { //1번 을 보는데 아마 2를 갖고 있는 엣지가 나올것
                if (!ch[cost.vex]){//2번은 거짓이니
                    ch[cost.vex] = true; // 트루
                    queue.offer(new Edge(cost.vex, poll.cost + cost.cost)); // 그럼 이제 2번을 넣어주어야 함
                }
            }
        }
    }


    static class Edge{
        int vex;
        long cost; //int 타입으로 실수함

        public Edge(int vex, long cost) {
            this.vex = vex;
            this.cost = cost;
        }
    }
}