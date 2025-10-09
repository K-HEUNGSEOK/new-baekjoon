
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n, ans;
    static Egg[] arr;
    static int[] param;
    static ArrayList<Egg> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = 0;
        arr = new Egg[n];
        param = new int[n];
        for(int i = 0 ; i < n ; i ++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Egg(x,y);
        }
        DFS(0);
        System.out.println(ans);
    }
    // 무게 자체가 depend - weight 하고 상대는 depend - 전꺼 weight 를 하는데 어느 하나라도 depned 가 - 가 나오면 cnt ++;
    static void DFS(int v){
        if(v == n){
            int cnt = 0;
            for(int i = 0 ; i < n ; i ++){
                if(arr[i].depend <= 0) {
                    cnt ++;
                }
            }
            ans = Math.max(ans,cnt);
            return;
        }else{
            if(arr[v].depend <= 0){
                DFS(v+1);
                return;
            }
            boolean flag = false;
            for(int i = 0 ; i < n ; i ++){
                if(v == i) continue;
                if(arr[i].depend > 0) flag = true;
            }
            if(!flag){
                DFS(v+1);
                return;
            }

            for(int i = 0 ; i < n ; i ++){
               if(v == i|| arr[i].depend <= 0) continue;
                else {
                    arr[v].depend = arr[v].depend - arr[i].weight;
                    arr[i].depend = arr[i].depend - arr[v].weight;
                    DFS(v + 1);
                    arr[v].depend = arr[v].depend + arr[i].weight;
                    arr[i].depend = arr[i].depend + arr[v].weight;
                }
            }
        }
    }
    static class Egg{
        int depend, weight;

        public Egg(int depend, int weight) {
            this.depend = depend;
            this.weight = weight;
        }
    }
}