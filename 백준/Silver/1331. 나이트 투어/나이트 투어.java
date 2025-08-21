import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[][] board = new int[7][7];
        int startX = 0, startY = 0;
        int endX = 0, endY = 0;

        int prevX = 0; int prevY= 0;
        for(int i = 0 ; i < 36; i ++){
            char[] arr = sc.next().toCharArray();
            int x = Math.abs((arr[1]-'0') - 6) + 1;
            int y = arr[0]-'A'+1;


            if (i == 0){
                startX = x;
                startY = y;
                prevX = x;
                prevY = y;
            }
            if (i == 35){
                endX = x;
                endY = y;
            }

            if (i >= 1){
                int dx = Math.abs(prevX - x);
                int dy = Math.abs(prevY - y);
                if (!((dx == 1 && dy == 2) || (dx == 2 && dy ==1))){
                    System.out.println("Invalid");
                    return;
                }
                prevX = x;
                prevY = y;
            }
            board[x][y] ++;
        }
        boolean check = true;
        for(int i = 1; i <= 6; i ++){
            for(int j = 1; j <= 6; j ++){
                if (board[i][j] > 1 || board[i][j] == 0){
                    check = false;
                    break;
                }
            }
        }

        if (!check){
            System.out.println("Invalid");
            return;
        }

        //조건 추가 마지막 위치랑 시작지점이랑 갈 수 있나?
        //가로로 2칸 + 세로로 1칸
        //또는 세로로 2칸 + 가로로 1칸
        int dx = Math.abs(startX - endX);
        int dy = Math.abs(startY - endY);
        if (!((dx == 1 && dy == 2) || (dx == 2 && dy ==1))){
            check= false;
        }
        if (check){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}