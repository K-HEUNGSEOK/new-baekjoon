import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static Station[] st ;
    public static void main(String[] args) throws FileNotFoundException {
  
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z = 1 ; z<= T;  z++) {
            int n = sc.nextInt(); //정류장 개수
            StringBuilder sb = new StringBuilder(); //정답 출력할거임
            st = new Station[n];
            for(int i = 0; i < n ; i ++){
                int start = sc.nextInt();
                int end = sc.nextInt();
                st[i] = new Station(start, end);
            }

            int p = sc.nextInt();
            for(int i = 0 ; i < p; i ++){
                int check = sc.nextInt();
                int cnt = getCount(check);
                sb.append(cnt).append(" ");
            }
            System.out.println("#" + z + " " + sb.toString());
        }
    }
    static int getCount(int check){
        int cnt = 0;
        for(Station s : st){
            if(s.start <= check && check <= s.end){
                cnt ++;
            }
        }
        return cnt;
    }
    static class Station{
        int start, end;
        public Station(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}


