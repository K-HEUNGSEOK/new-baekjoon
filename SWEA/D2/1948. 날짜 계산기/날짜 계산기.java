import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    static int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);

        //기본 세팅
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
            //날짜는 일로 바꿔서 계산한다
            int monthA = sc.nextInt();
            int dayA = sc.nextInt();

            int totalA = 0;
            for(int i = 0; i < monthA-1; i ++){
                totalA += months[i];
            }
            totalA += dayA;

            int totalB = 0;
            int monthB = sc.nextInt();
            int dayB = sc.nextInt();
            for(int i = 0; i < monthB-1; i ++){
                totalB += months[i];
            }
            totalB += dayB;

            int ans = totalB - totalA + 1;

            System.out.println("#" + l + " " + ans);

        }
    }
}

