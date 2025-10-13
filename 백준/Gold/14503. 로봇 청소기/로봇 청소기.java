import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    static int[] dy = {0, 1, 0, -1};
    static int n, m, x, y, move;
    static int[][] arr;
    // ans 변수를 static으로 빼서 전역에서 관리하는 것이 더 깔끔합니다.
    static int ans = 0; 

    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        x = sc.nextInt();
        y = sc.nextInt();
        move = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // while문 밖에서 시작 위치를 먼저 청소하고 시작하는게 좋습니다.
        // 하지만 문제 조건에 따라 while문 안에서 처리해도 되므로, 학생의 로직을 살리겠습니다.
        
        while(true){
            // 1. 현재 위치가 청소되지 않았다면 청소한다.
            if(arr[x][y] == 0){
                arr[x][y] = 2; // 청소했다는 의미로 2로 변경
                ans++;
            }

            // 2. 주변 4칸 중 청소할 곳이 있는지 탐색한다.
            boolean flag = false;
            // ★★★ 가장 중요한 수정 부분 ★★★
            // 'move'를 직접 바꾸지 않고, 탐색용 방향 변수 'd'를 사용합니다.
            int original_move = move; // 현재 방향을 기억해둡니다.

            for(int i = 0 ; i < 4; i++){
                // 왼쪽으로 회전한 방향을 'next_move'로 계산
                int next_move = (move + 3) % 4;
                int nx = x + dx[next_move];
                int ny = y + dy[next_move];

                if(isRange(nx,ny) && arr[nx][ny] == 0){
                    // 청소할 곳을 찾았으면, 그쪽으로 이동하고 루프의 처음으로 돌아갑니다.
                    move = next_move; // 실제 방향을 그쪽으로 바꿔주고
                    x = nx;
                    y = ny;
                    flag = true; // 청소할 곳을 찾았다고 표시
                    break; // 탐색 중단
                }
                
                // ★★★ 여기도 중요! ★★★
                // 청소할 곳을 못찾았으면, 탐색 방향만 왼쪽으로 돌립니다. (실제 로봇 방향이 아닌)
                move = next_move;
            }

            // 3. 4방향 탐색 후 행동 결정
            if(flag){
                // 청소할 곳을 찾아서 위에서 이동했으므로, while문의 다음 반복으로 넘어갑니다.
                continue;
            } else {
                // 4방향 모두 청소할 곳이 없는 경우, 후진
                move = original_move; // 탐색하느라 돌아갔던 방향을 원래대로 복구!
                int nx = x - dx[move]; // 후진은 현재 방향에서 뒤로 가는 것
                int ny = y - dy[move]; // dx, dy를 빼줍니다.

                if(isRange(nx,ny) && arr[nx][ny] != 1){
                    // 뒤가 벽이 아니라서 후진 가능
                    x = nx;
                    y = ny;
                } else {
                    // 뒤가 벽이라 후진도 불가능하면 작동을 멈춘다.
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}