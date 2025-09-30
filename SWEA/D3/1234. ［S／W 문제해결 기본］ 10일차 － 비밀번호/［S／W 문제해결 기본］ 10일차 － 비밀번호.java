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

            Stack<Integer> stack = new Stack<>();
            for(int i = 0 ; i < n ; i ++){
                int current = str.charAt(i) -'0';

                if (!stack.isEmpty() && stack.peek() == current){
                    stack.pop();
                }else{
                    stack.push(current);
                }
            }


            System.out.print("#" + z + " ");
            for (Integer i : stack) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


