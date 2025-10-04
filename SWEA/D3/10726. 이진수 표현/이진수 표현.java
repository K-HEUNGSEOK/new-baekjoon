import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String binary = Integer.toBinaryString(m);
            int cnt = 0;
            for(int i = binary.length()-1; i >= 0; i --){
                if(binary.charAt(i) == '1'){
                    cnt ++;
                }else{
                    break;
                }
            }
            String ans = "";
            if(cnt >= n)  ans = "ON";
            else ans = "OFF";
            System.out.println("#" + z + " " + ans);
        }
    }
}


