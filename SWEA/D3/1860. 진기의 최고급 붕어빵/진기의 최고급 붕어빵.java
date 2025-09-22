import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int n = sc.nextInt(); // 사람 수
            int m = sc.nextInt(); // 붕어빵 만드는 시간
            int k = sc.nextInt(); // m 초마다 만들어지는 갯수
            boolean flag = true; //스위치

            int[] arr = new int[n]; //사람 수
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            for(int i = 0 ; i < n ; i ++){
                int b = (arr[i] / m) * k;

                int g = i + 1;
                if (b < g){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("#" + z + " Possible");
            }else{
                 System.out.println("#" + z + " Impossible");
       
            }
        }
    }
}


