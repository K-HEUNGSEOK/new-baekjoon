import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int z = 1; z <= T; z++) {
            int n = sc.nextInt(); //암호문의 갯수
            List<Integer> list = new LinkedList<>();
            for(int i = 0 ; i < n ; i ++){
                list.add(sc.nextInt());
            }
            int m = sc.nextInt(); //명령문의 갯수
            for(int i = 0 ; i < m ; i ++){
                char q = sc.next().charAt(0); //버리는거
                int x = sc.nextInt()-1; //인덱스
                int y = sc.nextInt(); //y 개의 숫자를 집어넣어라

                for(int j = 1 ; j <= y; j ++){
                    int num = sc.nextInt();
                    list.add(x+j,num);
                }
            }

            System.out.print("#" + z + " ");
            for(int i = 0 ; i < 10 ; i ++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}


