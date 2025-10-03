import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            char[][] arr = new char[5][16];
            for(int i = 0 ; i < 5; i ++){
                String str = sc.next();
                for(int j = 0 ; j < str.length(); j ++){
                    arr[i][j] = str.charAt(j);
                }
            }
            //모든건 알파벳과 숫자로만 이루어짐
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < 16; i ++){
                for(int j = 0 ; j < 5; j ++){
                    if(Character.isDigit(arr[j][i]) || Character.isAlphabetic(arr[j][i])){
                        sb.append(arr[j][i]);
                    }
                }
            }
            System.out.println("#" + z + " " + sb.toString());
        }
    }
}


