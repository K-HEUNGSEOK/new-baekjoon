import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static String [] num = {"0001101", "0011001", "0010011", "0111101", "0100011","0110001","0101111","0111011","0110111","0001011"};
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] arr = new char[n+1][m+1];
            int x = 0;
            int y = 0;
            for(int i = 0 ; i < n ; i ++){
                String str = sc.next();
                for(int j = 0 ; j < m; j ++){
                    arr[i][j] = str.charAt(j);
                    if (arr[i][j] == '1'){
                        x = i;
                        y = j;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();

            for(int i = y ; i > y - 56; i --){
                sb.append(arr[x][i]);
            }
            String str = sb.reverse().toString();

            StringBuilder ans = new StringBuilder();
            for(int i = 0 ; i < str.length(); i += 7){
                String sub = str.substring(i, i+7);
                for(int j = 0 ; j < num.length; j ++){
                    if (num[j].equals(sub)){
                        ans.append(j);
                        break;
                    }
                }
            }
            String temp = ans.toString();
            int ans1 = 0; //짝수
            int ans2 = 0; //홀수
            int total = 0;
            for(int i = 0 ; i < temp.length(); i ++){
                if (i % 2 == 0){
                    ans1 += (temp.charAt(i) -'0');
                }else{
                    ans2 += (temp.charAt(i) -'0');
                }

                total += (temp.charAt(i)-'0');
            }
            ans1 *= 3;

            if ((ans1 + ans2) % 10 == 0){
                System.out.println("#" + z + " " + total);
            }else{
                System.out.println("#" + z + " " + 0);
            }
        }
    }
}


