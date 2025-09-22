import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int n;
    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int z = 1; z <= T; z++){
            int ans = 0 ;
            n = sc.nextInt();
            int [][] arr = new int[n][n];
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    arr[i][j] = sc.nextInt();
                }
            }


            //1은 아래로 // 2는 위로 가는 성질이 있는데 0보다 작아지거나 n 보다 커지면 없애버린다
            //1과 2는 동시에 위 아래로 이동하는데 만약 위 아래에 뭐가 있다면 겹친다면 거기서 멈춘다.

            //1. 일단 먼저 두개가 다 없는건 없애버리자.
            for(int i = 0 ; i < n ; i ++){
                boolean flagA = false; //1
                boolean flagB = false; //2
                for(int j = 0 ; j < n ; j ++){
                    if (arr[j][i] == 1) flagA = true;
                    else if(arr[j][i] == 2) flagB = true;
                }
                if (!flagA || !flagB){
                    for(int k = 0 ; k < n; k ++)arr[k][i] = 0;
                }
            }


            //이제 맨 위에서부터 1이나오기 전까진 다 없애버리고
            //맨 뒤에서부터 2가 나오기전까지 다 없애버리면 됨
            for(int i = 0 ; i < n; i ++){
                for(int j = 0 ; j < n ; j ++){
                    if (arr[j][i] != 1){
                        arr[j][i] = 0;
                    }else{
                        break;
                    }
                }
            }

            for(int i = 0 ; i < n; i ++){
                for(int j = n-1 ; j >= 0 ; j --){

                    if (arr[j][i] != 2){
                        arr[j][i] = 0;
                    }else{
                        break;
                    }
                }
            }

            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    if (arr[j][i] == 1){
                        for(int k = j + 1; k < n ; k ++){
                            if (arr[k][i] == 1){
                                break;
                            }else if(arr[k][i] == 2){
                                ans ++;
                                break;
                            }
                        }
                    }
                }
            }

            System.out.println("#" + z + " " + ans);
        }
    }
    static void print(int[][] arr){
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


