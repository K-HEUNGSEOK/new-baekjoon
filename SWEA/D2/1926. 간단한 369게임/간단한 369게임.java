import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i <= n ; i ++){
                int cnt = check(i);
                if(cnt == 0){
                    sb.append(i).append(" ");
                }else{
                    for(int j = 0 ; j < cnt; j ++){
                        sb.append("-");
                    }
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());

    }
    static int check(int n){
        int cnt = 0;
        char[] a  = (n +"").toCharArray();

        for(char x : a){
            if(x == '3' || x == '6' || x == '9') cnt ++;
        }
        return cnt;
    }
}


