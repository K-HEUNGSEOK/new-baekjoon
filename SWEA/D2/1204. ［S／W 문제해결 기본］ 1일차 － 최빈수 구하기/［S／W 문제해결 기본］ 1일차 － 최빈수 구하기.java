import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z = 1 ; z <= T ; z ++){
            int index = sc.nextInt();
            int findNumber = 0;
            int cnt = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0 ; i < 1000; i ++){
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num, 0) +1);
            }

            for (Integer i : map.keySet()) {
                if (map.get(i) > cnt){
                    cnt = map.get(i);
                    findNumber = i;
                }else if (map.get(i) == cnt){
                    findNumber = Math.max(findNumber,i);
                }
            }
            System.out.println("#"+index + " " + findNumber);
        }
    }
}
