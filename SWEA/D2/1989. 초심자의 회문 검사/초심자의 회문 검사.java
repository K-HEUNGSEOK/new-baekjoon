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
            boolean flag = true;

            String str = sc.next();
            for(int i = 0 ; i < str.length(); i ++){
                if (str.charAt(i) != str.charAt(str.length()-1-i)){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("#" + l + " " + 1);
            }else{
                System.out.println("#" + l + " " + 0);
            }

        }
    }
}

