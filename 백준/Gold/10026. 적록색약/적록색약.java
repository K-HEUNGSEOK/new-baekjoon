import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.List;

public class Main {
    static int n;
    static char[][] graph;
    static boolean[][] ch;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        //적록 색약인사람 R이랑 G랑 같음
        //일반인은 다 구별함
        n = sc.nextInt();
        graph = new char[n][n];

        for(int i = 0 ; i < n ; i ++){
            graph[i] = sc.next().toCharArray();
        }
        int person = 0;
        int colorPerson = 0;
        ch = new boolean[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if (!ch[i][j]){
                    person ++;
                    DFS(i,j);
                }
            }
        }
        ch = new boolean[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if (!ch[i][j]){
                    colorPerson ++;
                    DFS2(i,j);
                }
            }
        }
        System.out.println(person + " " + colorPerson);
    }
    static void DFS2(int x, int y){
        ch[x][y] = true;
        char current = graph[x][y];
        for(int i = 0 ; i < 4; i ++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isRange(nx,ny) && !ch[nx][ny]){
                if (current == 'R' || current == 'G'){
                    if (graph[nx][ny] == 'R' || graph[nx][ny] == 'G'){
                        ch[nx][ny] = true;
                        DFS2(nx,ny);
                    }
                }else{
                    if (current == graph[nx][ny]){
                     ch[nx][ny] = true;
                     DFS2(nx,ny);
                    }
                }
            }
        }
    }
    static void DFS(int x, int y){
        ch[x][y] = true;
        char current = graph[x][y];
        for(int i = 0 ; i < 4; i ++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isRange(nx,ny) && !ch[nx][ny] && graph[nx][ny] == current){
                ch[nx][ny] = true;
                DFS(nx,ny);
            }
        }
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}