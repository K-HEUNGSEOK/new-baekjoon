import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
  
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            //처음 입력세팅
            char[] str = sc.next().toCharArray();
            char[] temp = new char[str.length];

            for(int i = 0 ; i < str.length; i ++){
                temp[i] = '0';
            }
            int ans = 0;
            for(int i = 0 ; i < str.length; i ++){
                char current = str[i];
                if (current != temp[i]){
                    ans ++;
                    for(int j = i ; j <  str.length; j ++){
                        temp[j] = current;
                    }
                }
            }
        System.out.println("#" + z + " " + ans);
        }
    }
}

