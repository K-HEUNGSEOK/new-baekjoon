import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    static int n, k;
    static int[] visit;
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        visit = new int[n + 1];
        visit[0] = 1;
        BFS(0);
        if (visit[n] != 0 && visit[n] -1 <= k){
            System.out.println("minigimbob");
        }else{
            System.out.println("water");
        }
    }
    static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()){
            int temp = queue.poll();

            int tempA = temp + 1;
            if (tempA <= n && visit[tempA] == 0){
                queue.offer(tempA);
                visit[tempA] = visit[temp] + 1;
            }
            int tempB = temp + (temp/2);
            if (tempB <= n && visit[tempB] == 0){
                queue.offer(tempB);
                visit[tempB] = visit[temp] + 1;
            }
        }
    }
}