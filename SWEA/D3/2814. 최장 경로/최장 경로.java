import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    static int n,m,ans;
    static ArrayList<Integer>[] graph;
    static boolean[] ch;
    public static void main(String[] args) throws FileNotFoundException {
   
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            n = sc.nextInt();
            m = sc.nextInt();
            graph = new ArrayList[n+1];
            for(int i = 0 ; i <= n ; i ++){
                graph[i] = new ArrayList<>();
            }

            for(int i = 0 ; i < m ; i ++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph[a].add(b);
                graph[b].add(a);
            }
            ans = 0;
            ch = new boolean[n+1];
            for(int i = 1 ; i<= n ; i ++){
                ch[i] = true;
                DFS(i,1);
                ch[i] = false;
            }
        System.out.println("#" + z + " " + ans);
        }
    }
    static void DFS(int v, int cnt){
        ans = Math.max(ans,cnt);

            for (Integer nx : graph[v]) {
                if (!ch[nx]){
                    ch[nx] = true;
                    DFS(nx,cnt +1);
                    ch[nx] = false;
                }
            }
        }
    }

