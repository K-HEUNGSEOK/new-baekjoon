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
            int[] nums = {2,3,5,7,11};
            int[] temp = new int[5];

                for(int i = 0 ; i < 5; i ++){
                    while (n % nums[i] == 0){
                        temp[i] ++;
                        n /= nums[i];
                    }
                }
            System.out.print("#" + l + " " );
            for (int i : temp) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

