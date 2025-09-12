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
            int hoursA = sc.nextInt();
            int monthA = sc.nextInt();
            int hoursB = sc.nextInt();
            int monthB = sc.nextInt();

            int totalA = hoursA * 60 + monthA;
            int totalB = hoursB * 60 + monthB;

            int temp = totalA + totalB;
            int ansH = temp / 60;
            if (ansH > 12) ansH -= 12;
            int ansM = temp % 60;
            
            System.out.println("#" + l + " " + ansH + " " + ansM);
        }
    }
}

