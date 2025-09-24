import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int cnt;
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i ++) {
            String str = sc.next();
            cnt = 1;
            if (isPalindrome(str,0, str.length()-1)){
                System.out.println(1 + " " + cnt);
            }else{
                System.out.println(0 + " " + cnt);
            }
        }
    }
    static boolean isPalindrome(String str, int lt, int rt){
        if (lt >= rt)return true;
        if (str.charAt(lt) != str.charAt(rt)) return false;

        cnt ++;
        return isPalindrome(str, lt+1, rt-1);
    }
}