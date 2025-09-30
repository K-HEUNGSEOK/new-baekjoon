import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static int n;
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
             n = sc.nextInt();
            boolean flag = false;
            char[][] arr = new char[n][n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.next().toCharArray();
            }

            if (check1(arr)){
                flag = true;
            }
            if (check2(arr)){
                flag = true;
            }


            System.out.print("#" + z);
            System.out.println(flag ? " YES" : " NO");

        }
    }

    static boolean check2(char[][]arr){
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                int cnt = 1;
                if (arr[i][j] == 'o'){
                    for(int k = 0; k < n ; k ++){
                        if (i + k + 1 < n && j + k + 1 < n && arr[i + k + 1][j + k + 1] == 'o'){
                            cnt ++;
                        }else break;
                    }
                    if (cnt >= 5) return true;
                }
            }
        }

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                int cnt = 1;
                if (arr[i][j] == 'o'){
                    for(int k = 0; k < n ; k ++){
                        if (i + k + 1 < n && j - (k + 1) >= 0 && arr[i + k + 1][j - (k + 1)] == 'o'){
                            cnt ++;
                        }else{
                            break;
                        }
                    }
                    if (cnt >= 5) return true;
                }
            }
        }


        return false;
    }


    static boolean check1(char[][] arr){

        //가로
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                int cnt = 1;
                if (arr[i][j] == 'o'){
                    for(int k = j + 1 ; k < n ; k ++){
                        if (arr[i][k] == 'o'){
                            cnt ++;
                        }else{
                            break;
                        }
                    }
                }
                if (cnt >= 5){
                    return true;
                }
            }
        }

        //세로
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                int cnt =1;
                if (arr[j][i] == 'o'){
                    for(int k = j + 1; k < n ; k ++){
                        if (arr[k][i] == 'o'){
                            cnt ++;
                        }
                        else {break;}
                    }

                    if (cnt >= 5) return true;
                }
            }
        }
        return false;
    }
}


