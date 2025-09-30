import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
  
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int z = 1; z <= T; z++) {
            int remove = sc.nextInt();
            int n = 8;
            Deque<Integer> list = new ArrayDeque<>();
            for(int i = 0 ; i < 8; i ++){
                list.add(sc.nextInt());
            }
            int cnt = 1;
            while (true){
                Integer pop = list.pop();

                pop -= cnt;
                if (pop <= 0){
                    list.add(0);
                    break;
                }
                list.add(pop);
                cnt ++;
                if (cnt > 5){
                    cnt = 1;
                }

            }


            //출력
            System.out.print("#" + z + " " );
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}


