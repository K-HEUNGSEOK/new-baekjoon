
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n, ans;
    static boolean[] check_col;
    static boolean[] check_diag1; // ↘ 방향  여기는 row - col 이 같음
    static boolean[] check_d1ag2; // ↙ 방향
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = 0;
        check_col = new boolean[40]; //세로
        check_diag1 = new boolean[40]; //세로
        check_d1ag2 = new boolean[40]; //세로

        DFS(0);
        System.out.println(ans);
    }
    static void DFS(int col){
        if (col == n){
            ans ++;
        }else{
            for(int i = 0 ; i < n ; i ++){
                if (!check_col[i] && !check_diag1[col - i + (n-1)] && !check_d1ag2[col + i]){
                    check_col[i] = true; //세로체크
                    check_diag1[col - i + (n-1)] = true; //대각선 체크
                    check_d1ag2[col + i] = true;
                    DFS(col + 1);
                    check_col[i] = false; //세로체크
                    check_diag1[col - i + (n-1)] = false; //대각선 체크
                    check_d1ag2[col + i] = false;
                }
            }
        }
    }
}