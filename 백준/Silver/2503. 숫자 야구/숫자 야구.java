import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        BaseBall[] baseBalls = new BaseBall[n];
        for(int i = 0 ; i < n ; i ++){
            int num = sc.nextInt();
            int strike = sc.nextInt();
            int boll = sc.nextInt();
            baseBalls[i] = new BaseBall(num,strike,boll);
        }
        for(int i = 123; i <= 987; i ++){
            if (check(i)){
                if (logic(i,baseBalls)){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
    //스트라이크의 갯수만큼 똑같아야한다.
    //볼의 갯수만큼도 똑같아야 한다.
    static boolean logic(int n, BaseBall[] baseBalls){
        String test = String.valueOf(n);

        for (BaseBall baseBall : baseBalls) {
            int cntStrike = 0;
            int cntBoll = 0;
            String compare = String.valueOf(baseBall.score);
            for(int i = 0 ; i < 3; i ++){
                for(int j = 0 ; j < 3; j ++){
                    if (test.charAt(i) == compare.charAt(j)){
                        if (i == j) cntStrike ++;
                        else cntBoll ++;
                    }
                }
            }
            if (cntStrike != baseBall.strike || cntBoll != baseBall.boll) return false;
        }
        return true;
    }
    static boolean check(int n){
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100 % 10;
        return a != b && b != c && a != c && a != 0 && b != 0 && c != 0;
    }
    static class BaseBall{
        int score;
        int strike;
        int boll;

        public BaseBall(int score, int strike, int boll) {
            this.score = score;
            this.strike = strike;
            this.boll = boll;
        }
    }
}