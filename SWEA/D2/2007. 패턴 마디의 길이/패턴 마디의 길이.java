import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.util.*;

public class Solution {
    static char[] temp = new char[10];
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
            int ans = 0;
            String str = sc.next();
            for(int i = 1 ; i <= 10 ; i ++){
                String tempA = str.substring(0,i);
                String tempB = str.substring(i,i*2);

                if (tempA.equals(tempB)){
                    ans = tempA.length();
                    break;
                }
            }
            System.out.println("#" + l + " " + ans);
        }
    }
}

