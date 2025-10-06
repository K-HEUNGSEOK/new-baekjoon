
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n;
    static char[][] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
         arr = new char[n][n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.next().toCharArray();
        }
        DFS(0,0,n);
        System.out.println(sb);


    }
    static void DFS(int x, int y, int size){
        if(check(x,y,size)){
            sb.append(arr[x][y]);
            return;
        }else{
            sb.append("(");
            int len = size/2;
            DFS(x, y, len); //왼쪽위
            DFS(x, y+len, len); //오른족위
            DFS(x+len,y,len);
            DFS(x+len, y +len, len);
            sb.append(")");
        }
    }
    static boolean check(int x, int y, int size){
        char temp = arr[x][y];
        for(int i = x ; i < x + size; i ++){
            for(int j = y ; j < y + size; j ++){
                if(arr[i][j] != temp) return false;
            }
        }
        return true;
    }
    static void print(){
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}