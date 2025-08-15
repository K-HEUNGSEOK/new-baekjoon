import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    static int[][] arr;
    static int blue, white;
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n][n];
        blue = 0;
        white = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j< n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        execute(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }
    static void execute(int x, int y, int size){
        int color = arr[x][y];
        boolean same = checkSameColor(x,y,size);
        if (same){
            //다 같으면 여기서 이제 색종이 갯수 세주는 것
            if (color == 0) white++;
            else blue++;
        }else{
            //아니면 분할 해야함
            size /= 2;
            execute(x , y , size);
            execute(x , y + size , size);
            execute(x + size, y , size);
            execute(x + size, y + size , size);
        }
    }
    //같은 색 여부 판단 함수
    static boolean checkSameColor(int x, int y, int size){
        int color = arr[x][y];
        for(int i = x ; i < x + size; i ++){
            for(int j = y ; j < y + size; j ++){
                if (arr[i][j] != color ){
                    return false;
                }
            }
        }
        return true;
    }

}