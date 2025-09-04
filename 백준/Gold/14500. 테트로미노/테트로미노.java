import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][][] tromino = {
            {
                    {1,1,1,1},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
            },
            {
                    {1,0,0,0},
                    {1,0,0,0},
                    {1,0,0,0},
                    {1,0,0,0},
            },
            {
                    {1,1,0,0},
                    {1,1,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
            },
            {
                    {1,0,0,0},
                    {1,0,0,0},
                    {1,1,0,0},
                    {0,0,0,0},
            },
            {
                    {0,1,0,0},
                    {0,1,0,0},
                    {1,1,0,0},
                    {0,0,0,0},
            },
            {
                    {1,1,1,0},
                    {1,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}
            },
            {
                    {1,1,1,0},
                    {0,0,1,0},
                    {0,0,0,0},
                    {0,0,0,0}
            },
            {
                    {1,1,0,0},
                    {0,1,0,0},
                    {0,1,0,0},
                    {0,0,0,0}
            },
            {
                    {1,1,0,0},
                    {1,0,0,0},
                    {1,0,0,0},
                    {0,0,0,0}
            },
            {
                    {0,0,1,0},
                    {1,1,1,0},
                    {0,0,0,0},
                    {0,0,0,0}
            },
            {
                    {1,0,0,0},
                    {1,1,1,0},
                    {0,0,0,0},
                    {0,0,0,0}
            },
            {
                    {1,1,1,0},
                    {0,1,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
            },
            {
                    {0,1,0,0},
                    {1,1,0,0},
                    {0,1,0,0},
                    {0,0,0,0},
            },
            {
                    {0,1,0,0},
                    {1,1,1,0},
                    {0,0,0,0},
                    {0,0,0,0},
            },
            {
                    {1,0,0,0},
                    {1,1,0,0},
                    {1,0,0,0},
                    {0,0,0,0}
            },
            {
                    {1,0,0,0},
                    {1,1,0,0},
                    {0,1,0,0},
                    {0,0,0,0}
            },
            {
                    {0,1,0,0},
                    {1,1,0,0},
                    {1,0,0,0},
                    {0,0,0,0}
            },
            {
                    {0,1,1,0},
                    {1,1,0,0},
                    {0,0,0,0},
                    {0,0,0,0}
            },
            {
                    {1,1,0,0},
                    {0,1,1,0},
                    {0,0,0,0},
                    {0,0,0,0}
            }
    };
    static int n, m, ans ;
    static int[][] arr;
    static int SIZE = 19;
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0; j < m ; j ++){
                ans = Math.max(ans, getMax(i,j));
            }
        }
        System.out.println(ans);
    }
    static int getMax(int x , int y){
        int max = 0;
        for(int i = 0 ; i < SIZE; i ++){
            int sum = 0;
            boolean check = true;
            for(int j = 0; j < 4; j ++){
                for(int k = 0 ; k < 4; k ++){
                    if (tromino[i][j][k] == 0) continue;
                    if (x + j >= n || y + k >= m) check =false;
                    else {
                        sum += arr[j + x][k + y];
                    }
                }
            }
            if (check){
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}