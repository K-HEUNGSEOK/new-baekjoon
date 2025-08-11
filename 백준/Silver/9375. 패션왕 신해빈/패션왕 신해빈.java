import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T -- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            Map<String,Integer> map = new HashMap<>();
            for(int i = 0 ; i < n ; i ++){
                String str = sc.nextLine();
                String[] split = str.split(" ");
                map.put(split[1], map.getOrDefault(split[1],0) + 1);
            }

            //종류가 다 같으면 그냥 size 출력하면 되겠네
            if (map.size() == 1){
                for (Integer value : map.values()) {
                    System.out.println(value);
                }
            }else{
                long ans = 1;
                for (Integer value : map.values()) {
                    ans *= value + 1;
                }
                System.out.println(ans-1);
            }

        }
    }
}