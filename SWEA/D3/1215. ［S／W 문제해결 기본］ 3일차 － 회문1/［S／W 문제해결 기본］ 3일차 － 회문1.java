import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    static int k = 8;
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);

        int T = 10;
        for (int l = 1; l <= T; l++) {
            int n = sc.nextInt(); //낱말 길이
            char[][] arr = new char[k][k];
            int ans = 0; //정답 갯수
            for(int i = 0 ; i < k; i ++){
                arr[i] = sc.next().toCharArray();
            }

            //1.회문 찾기 (가로)
            for(int i = 0 ; i < k ; i ++){
                for(int j = 0; j <= k -n ; j ++){
                    char[] temp = new char[n];
                    int index = 0;
                    for(int z = j; z < j + n; z ++){
                        temp[index++] = arr[i][z];
                    }
                    //여기서 회문 체크
                    if (isCheck(temp)){
                        ans ++;
                    }
                }
            }

            for(int i = 0 ; i <= k-n ; i ++){
                for(int j = 0; j < k  ; j ++){
                    char[] temp = new char[n];
                    int index = 0;
                    for(int z = i; z < i + n; z ++){
                        temp[index++] = arr[z][j];
                    }
                    //여기서 회문 체크
                    if (isCheck(temp)){
                        ans ++;
                    }
                }
            }



            System.out.println("#" + l  +" " + ans);
        }
    }
    static boolean isCheck(char[] temp){
        for(int i = 0 ; i < temp.length; i ++){
            if (temp[i] != temp[temp.length-1-i]){
                return false;
            }
        }
        return true;
    }
}

