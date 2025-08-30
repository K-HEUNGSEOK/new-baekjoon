import java.io.*;
import java.util.*;

public class Main {
    static int n, target, height, width;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        //2번가면 두배씩 늘어남
        n = sc.nextInt();
         target = sc.nextInt();
         height = 0;
         width = 0;
        int[][]arr = new int[n][n];
        int cnt = 1;

        int x = n /2;
        int y = n /2;


        arr[x][y] = cnt ++; //중앙
        int check = 1;
        int move = 0;

        while (cnt < n * n){
            //두번 이동할때마다 2배씩 늘어나는데 이걸 구현해야한다.

            for(int i = 0 ; i < 4 ; i ++){

                for(int j = 0 ; j < check; j ++){
                    x += dx[i];
                    y += dy[i];
                    if (isRange(x,y)){
                        arr[x][y] = cnt ++;
                    }
                }
                move ++;

                if (move != 0 && move % 2 == 0){
                    check ++;
                }
            }
        }
        print(arr);
        System.out.println(height + " " + width);
    }

    private static void print(int[][] arr) {
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == target){
                    height = i + 1;
                    width = j + 1;
                }
            }
            System.out.println();
        }
    }

    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}