import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static char[] direction = {'^', '>', 'v', '<'};
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int x, y, n, m;
    static char cur;
    static char[][] arr;

    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            //1.처음 입력받기
            n = sc.nextInt();
            m = sc.nextInt();
            x = 0;
            y = 0;
            cur = '<';
            arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                for (int j = 0; j < m; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            //2. x y 와 처음 방향 찾기
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (arr[i][j] == direction[k]) {
                            x = i;
                            y = j;
                            cur = direction[k];
                            break;
                        }
                    }
                }
            }
            arr[x][y] = '.';

            //3. 명령어 수행
            int q = sc.nextInt();
            char[] commandBox = sc.next().toCharArray();

            for (int i = 0; i < q; i++) {
                char command = commandBox[i];
                func(command);
            }

            arr[x][y] = cur;

            System.out.print("#" + z + " ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }

        }
    }

    static void func(char command) {
        int nx = 0;
        int ny = 0;
        switch (command) {
            case 'U':
                nx = x + dx[0];
                ny = y + dy[0];
                cur = direction[0];
                if (isRange(nx, ny) && arr[nx][ny] == '.') {
                    x = nx;
                    y = ny;
                }
                break;
            case 'R':
                nx = x + dx[1];
                ny = y + dy[1];
                cur = direction[1];
                if (isRange(nx,ny) && arr[nx][ny] == '.'){
                    x = nx;
                    y = ny;
                }
                break;
            case 'D':
                nx = x + dx[2];
                ny = y + dy[2];
                cur = direction[2];
                if (isRange(nx,ny) && arr[nx][ny] == '.'){
                    x = nx;
                    y = ny;
                }
                break;
            case 'L':
                nx = x + dx[3];
                ny = y + dy[3];
                cur = direction[3];
                if (isRange(nx,ny) && arr[nx][ny] == '.'){
                    x = nx;
                    y = ny;
                }
                break;
            case 'S':
                char c = cur;
                int cx = x;
                int cy = y;
                shot(c,cx,cy);
                break;
        }
    }
    static void shot(char cur, int nx, int ny){
        switch (cur){
            case '>':
                for(int i = ny; i < m; i ++){
                    if (arr[nx][i] == '#' || arr[nx][i] == '*'){
                        if (arr[nx][i] == '*') {
                            arr[nx][i] = '.';
                        }
                        break;
                    }
                }
                break;
            case 'v':
                for(int i = nx; i < n; i ++){
                    if (arr[i][ny] == '#' || arr[i][ny] == '*'){
                        if (arr[i][ny] == '*') {
                            arr[i][ny] = '.';
                        }
                        break;
                    }
                }
                break;
            case '<':
                for(int i = ny; i >= 0; i --){
                    if (arr[nx][i] == '#' || arr[nx][i] == '*'){
                        if (arr[nx][i] == '*') {
                            arr[nx][i] = '.';
                        }
                        break;
                    }
                }
                break;
            case '^':
                for(int i = nx; i >= 0; i --){
                    if (arr[i][ny] == '#' || arr[i][ny] == '*'){
                        if (arr[i][ny] == '*') {
                            arr[i][ny] = '.';
                        }
                        break;
                    }
                }
                break;
        }
    }

    static boolean isRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}


