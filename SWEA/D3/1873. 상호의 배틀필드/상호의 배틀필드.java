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
        if (command == 'S'){
            shot();
            return;
        }
        int nx = 0;
        int ny = 0;
        int move = 0;
        switch (command) {
            case 'U':
                move = 0;break;
            case 'R':
                move = 1;break;
            case 'D':
                move = 2;break;

            case 'L':
                move = 3;break;
        }
        cur = direction[move];
        nx = x + dx[move];
        ny = y + dy[move];
        if (isRange(nx,ny) && arr[nx][ny] == '.'){
            x = nx;
            y = ny;
        }
    }
    static void shot(){
        int idx = 0;
        for(int i = 0 ; i < 4; i ++){
            if (cur == direction[i]){
                idx = i;
                break;
            }
        }

        int nx = x;
        int ny = y;
        while (true){
            nx += dx[idx];
            ny += dy[idx];
            if (!isRange(nx,ny)) break;

            if (arr[nx][ny] == '*'){
                arr[nx][ny] = '.';
                break;
            }else if(arr[nx][ny] == '#'){
                break;
            }
        }
    }

    static boolean isRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}


