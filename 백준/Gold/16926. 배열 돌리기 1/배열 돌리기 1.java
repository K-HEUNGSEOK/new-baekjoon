
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n, m, k, layer;
    static int[][] arr;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        //↓ → ↑ ← 이거임
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        //껍질의 개수는 n 이랑 m 중에 작은거 / 2 하면 됨
        layer = Math.min(n,m) / 2;

        for(int i = 0 ; i < k ; i ++){
            rocate();
        }
        print();

    }
    static void rocate(){
        for(int t = 0; t < layer ; t ++){
            int x = t;
            int y = t;
            int idx =0;
            int temp = arr[x][y];
            while(idx < 4){
                int nx = x + dx[idx];
                int ny = y + dy[idx];

                if(isRange(nx,ny,t)){
                    arr[x][y] = arr[nx][ny];
                    x = nx;
                    y = ny;
                }else{
                    idx ++;
                }
            }
            arr[t+1][t] = temp;
        }
    }

    static boolean isRange(int x, int y, int t) {
        return t <= x && x < n-t && t <= y && y < m-t;
    }

    static void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}