import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) throws FileNotFoundException {
 
        Scanner sc = new Scanner(System.in);

        //기본 세팅
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
            int n = sc.nextInt();
            char[] alphabet = new char[n];
            int[] number = new int[n];
            for(int i = 0 ; i < n ; i ++){
                alphabet[i] = sc.next().charAt(0);
                number[i] = sc.nextInt();
            }

            int cnt = 0;
            System.out.println("#" + l);
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < number[i]; j ++){
                    System.out.print(alphabet[i]);
                    cnt ++;
                    if (cnt == 10){
                        System.out.println();
                        cnt = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}

