
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> basic = new HashSet<>();
        for(int i = 0 ; i < n ; i ++){
             basic.add(sc.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        int m = sc.nextInt();
        int[] target = new int[m];
        for(int i = 0 ; i < m ; i ++) target[i] = sc.nextInt();

        for(int i = 0 ; i < m ; i ++){
            if(basic.contains(target[i])){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}