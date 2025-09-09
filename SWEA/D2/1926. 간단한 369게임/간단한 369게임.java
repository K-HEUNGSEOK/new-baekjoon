import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n ; i ++){
            if (checkNumber(i,sb)){

            }else{
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
    static boolean checkNumber(int num, StringBuilder sb){
        char[] arr = String.valueOf(num).toCharArray();
        //횟수를 세서 그만큼 - 넣으면 되잖아
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for (char c : arr) {
            if (c - '0' == 3) cnt1 ++;
            else if(c-'0' == 6) cnt2 ++;
            else if(c-'0' == 9) cnt3 ++;
        }
        if (cnt1 == 0 && cnt2 == 0 && cnt3 ==0) return false;
        int total = cnt1 + cnt2 + cnt3;

        if (total > 1){
            for(int i = 0 ; i < total; i ++){
                sb.append('-');
            }
            sb.append(" ");
        }else{
            sb.append('-').append(" ");
        }
        return true;
    }
}
