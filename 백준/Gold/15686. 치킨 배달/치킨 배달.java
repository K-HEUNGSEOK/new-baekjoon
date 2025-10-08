
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n, m, ans;
    static int[][] graph;
    static ArrayList<Dict> h = new ArrayList<>();
    static ArrayList<Dict> p = new ArrayList<>();
    static Dict[] param;
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ans = Integer.MAX_VALUE;
        graph = new int[n][n];
        param = new Dict[m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                graph[i][j] = sc.nextInt();
                if(graph[i][j] == 1){
                    h.add(new Dict(i,j));
                }
                if(graph[i][j] == 2){
                    p.add(new Dict(i,j));
                }
            }
        }

        //조합을 한 것을 가지고 이제 피자 거리를 봐야하는거야
        //집의 모든걸 꺼내서 조합된것과 거리를 계산한 뒤에 total 을 더한다. 그 중 최소값을 찾는다
        combination(0,0);
        System.out.println(ans);
    }
    static void DFS(){
        int total = 0 ;
        for(Dict cur : h){
            int sum = Integer.MAX_VALUE;
            for(int i = 0 ; i < m; i ++){
                Dict next = param[i];
               sum = Math.min(sum,manhaten(cur.x,cur.y, next.x,next.y));
            }
            total += sum;
        }
        ans = Math.min(ans,total);
    }
    static void combination(int v, int start){
        if (v == m){
            DFS();
        }else{
            for(int i = start; i < p.size(); i ++){
                param[v] = p.get(i);
                combination(v + 1, i +1);
            }
        }
    }
    static class Dict{
        int x,y;

        public Dict(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString(){
            return "x = " + x + " y = " + y;
        }


    }
    static int manhaten(int x1, int y1, int x2, int y2){
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
}