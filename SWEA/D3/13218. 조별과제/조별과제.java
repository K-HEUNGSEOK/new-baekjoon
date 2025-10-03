import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int ans = 0;
            int n = sc.nextInt();
            if (n >= 3){
                ans = n / 3;
            }
            System.out.println("#" + z + " " + ans);
        }
    }
}


