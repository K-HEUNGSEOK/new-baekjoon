import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int z = 1; z <= T; z++) {
            String r = sc.nextLine();
            String[] split = r.split(" ");
            int n = Integer.parseInt(split[0]);
            String str = split[1];
            List<Integer> list = new LinkedList<>();
            for(int i = 0 ; i < n ; i ++){
                char st = str.charAt(i);
                list.add(Integer.parseInt(st+""));
            }

            while (true){
                int len = list.size();
                boolean flag = false;
                for(int i = len-1 ; i > 0 ; i --){
                    if (list.get(i) == list.get(i-1)){
                        flag = true;
                        list.remove(i);
                        list.remove(i-1);
                        break;
                    }
                }

                if (!flag) break;
            }
            System.out.print("#" + z + " ");
            for (Integer i : list) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


