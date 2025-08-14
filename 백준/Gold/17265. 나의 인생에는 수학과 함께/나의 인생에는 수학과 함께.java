import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    static int n, min, max;
    static char[][] arr;
    static int[] dx = {0,1};
    static int[] dy = {1,0};
    public static void main(String[] args) throws IOException {
  
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        arr = new char[n][n];
   //     ch = new boolean[n][n]; 오른쪽 아래쪽만 가기 때문에 필요가 없었다.
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0; j < n ; j ++){
                arr[i][j] = sc.next().charAt(0);
            }
        }
        DFS(0,0,arr[0][0]-'0',' ');
        System.out.println(max + " " + min);
    }
    static void DFS(int x, int y, int total, char command){
        //종료조건
        if (x == n-1 && y == n - 1){
           max = Math.max(max,total);
           min = Math.min(min,total);
        }else{
            for(int i = 0 ; i < 2; i ++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (isRange(nx,ny)){
                    if (!Character.isDigit(arr[nx][ny])){
                        DFS(nx,ny,total,arr[nx][ny]);
                    }
                    if (Character.isDigit(arr[nx][ny]) && command != ' '){
                        int temp = getNumber(total, command, arr[nx][ny]);
                        DFS(nx,ny, temp, command);
                    }
                }
            }
        }
    }
    static int getNumber(int p, char command, char next){

        int ne = next - '0';
        switch (command){
            case'+':
                return p + ne;
            case'-':
                return p - ne;
            case'*':
                return p * ne;
            case'/':
                return p / ne;
        }
        return -1;
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}