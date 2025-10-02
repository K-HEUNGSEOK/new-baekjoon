import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z = 1 ; z<= T;  z++){
            int a = sc.nextInt(); //이거 이상
            int b = sc.nextInt(); //이거 이하
            int x = sc.nextInt(); //내가 한 운동
            int ans = 0;

            if(x > b) ans = -1;
            else if(x < a){
                ans = a - x;
            }
            System.out.println("#" + z + " " + ans);
        }
    }
}


