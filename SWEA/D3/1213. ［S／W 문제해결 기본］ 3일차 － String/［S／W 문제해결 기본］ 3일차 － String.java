import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int z = 1; z <= T; z++) {
            int l = sc.nextInt();
            int ans = 0;
            String check = sc.next();
            String str = sc.next();
            while (true){
                int index = str.indexOf(check);
                if (index == -1){
                    break;
                }
                ans ++;
                str = str.substring(index+1);
            }
            System.out.println("#" + l + " " + ans);
        }
    }

}

