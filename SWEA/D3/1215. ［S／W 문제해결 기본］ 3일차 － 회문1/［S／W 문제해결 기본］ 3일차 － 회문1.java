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

            for(int i = 0 ; i < k ; i ++){
                for(int j = 0 ; j < k ; j ++){
                    if (i <= k-n){
                        char []temp = new char[n];
                        int index = 0;
                        for(int z = i; z < i + n; z ++){
                            temp[index++] = arr[z][j];
                        }
                        if (isCheck(temp)){
                            ans ++;
                        }
                    }

                    if (j <= k-n){
                        char []temp = new char[n];
                        int index = 0;
                        for(int z = j; z < j + n; z ++){
                            temp[index++] = arr[i][z];
                        }
                        if (isCheck(temp)){
                            ans ++;
                        }
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

