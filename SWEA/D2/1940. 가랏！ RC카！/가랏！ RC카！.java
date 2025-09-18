import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
  
        Scanner sc = new Scanner(System.in);
        //기본 세팅
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
            int time = sc.nextInt(); //총 가야 할 시간
            int[] arr = new int[35]; //채울 크기
            int cnt = 0; // 인덱스 추가 양
            for(int i = 1 ; i <= time; i ++){
                int command = sc.nextInt();
                if (command == 0){
                    arr[i] = cnt;
                }else if(command == 1){
                    int speed = sc.nextInt();
                    cnt += speed;

                    arr[i] = cnt;
                }else{
                    int spped = sc.nextInt();
                    cnt -= spped;
                    if (cnt < 0){
                        cnt = 0;
                    }

                    arr[i] = cnt;
                }
            }


            int ans = 0;
            for(int i = 1; i <= time; i ++){
                ans += arr[i];
            }
            System.out.println("#" + l + " " + ans);
        }
    }
}

