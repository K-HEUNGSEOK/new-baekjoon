import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    static int n,L,ans,cnt;
    static Food[] foods;
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        //기본 세팅
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
             n = sc.nextInt();
             L = sc.nextInt(); //칼로리
             foods = new Food[n];
            for(int i = 0 ; i < n ; i ++){
                int num= sc.nextInt();
                int score = sc.nextInt();
                foods[i] = new Food(num,score);
            }
            Arrays.sort(foods);
             ans = 0; //칼로리
             cnt = 0; //인기점수
            DFS(0,0,0);
            System.out.println("#" + l  +" " +  cnt);
        }
    }
    static void DFS(int v, int total, int number){
        if (total > L) return;
        if (v == n){
            if (cnt >= number) return; //인기점수가 기본보다 작으면 끝
            ans = total;
            cnt = number;
            return;
        }else{
            DFS(v + 1 , total + foods[v].score, number + foods[v].num);
            DFS(v + 1 , total, number);
        }
    }
    static class Food implements Comparable<Food>{
        int num, score;

        public Food(int num, int score) {
            this.num = num;
            this.score = score;
        }
        //오름차순 정렬
        @Override
        public int compareTo(Food o){
            if (this.score == o.score){
                return o.num - this.num;
            }
            return this.score - o.score;
        }
    }
}

