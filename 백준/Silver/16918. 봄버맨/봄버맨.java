
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n,m,k;
    static Box[][] arr;
    static int[] dx = {1,-1, 0, 0};
    static int[] dy = {0,0,1,-1};
     public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt(); // 세로
         m = sc.nextInt(); // 가로
         k = sc.nextInt(); // 카운트
        arr = new Box[n][m];

        for(int i = 0 ; i < n ; i ++){
            String str = sc.next();
            for(int j = 0 ; j < m ; j ++){
                arr[i][j] = new Box(str.charAt(j), 0);
            }
        }
        int cnt = 1;

         while(k -- > 1){
             cnt ++;
             //폭탄 터트리기
             Box[][] copy = copy();
             for(int i = 0 ; i < n; i ++){
                 for(int j = 0 ; j < m ; j ++){
                     if(arr[i][j].c == 'O' && arr[i][j].end == cnt){
                         boom(i,j, copy);
                     }
                 }
             }
             arr = copy;
             if(cnt % 2 == 0){
             fill(cnt);
             }
         }
         print();

     }
     static Box[][] copy(){
         Box[][] temp = new Box[n][m];
         for(int i = 0 ; i < n ; i ++){
             for(int j = 0 ; j < m ; j ++){
                 temp [i][j] = new Box(arr[i][j].c, arr[i][j].start);
             }
         }
         return temp;
     }
    static class Box{
         char c;
         int start, end;
         public Box(char c, int start){
             this.c = c;
             this.start = start;
             this.end = start + 3;
         }

        @Override
        public String toString() {
            return "Box{" +
                    "c=" + c +
                    ", start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
    //폭탄 채우는 로직
    static void fill(int cnt){
         for(int i = 0 ; i < n ; i ++){
             for(int j = 0 ; j < m ; j ++){
                 if(arr[i][j].c == '.'){
                     arr[i][j] = new Box('O', cnt);
                 }
             }
         }
    }
    //폭탄 터트리는 로직
    static void boom(int x, int y, Box[][] temp){
         temp[x][y] = new Box('.',0);
      for(int i = 0 ; i < 4; i ++){
          int nx = x + dx[i];
          int ny = y + dy[i];

          if(isRange(nx,ny) && temp[nx][ny].c == 'O'){
              temp[nx][ny] = new Box('.',0);
          }
      }

    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
    static void print(){
         for(int i = 0 ; i < n ; i ++){
             for(int j = 0 ; j < m; j ++){
                 System.out.print(arr[i][j].c);
             }
             System.out.println();
         }
    }
}