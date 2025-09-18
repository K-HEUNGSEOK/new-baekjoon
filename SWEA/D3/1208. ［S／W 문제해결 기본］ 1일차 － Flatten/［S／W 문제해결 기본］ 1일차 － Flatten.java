import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
 
        Scanner sc = new Scanner(System.in);
        //기본 세팅
      //  int T = sc.nextInt();
        for (int l = 1; l <= 10; l++) {
            int[] arr = new int[100];
            int ans = 0; //정답
            int count = sc.nextInt(); //덤프 횟수
            for(int i = 0 ; i < 100; i ++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0 ; i < count; i ++){
                int max = 0;
                int min = Integer.MAX_VALUE;
                //1. 최대값과 최소값을 찾는다.
                for(int j = 0 ; j < 100; j ++){
                    max = Math.max(max,arr[j]);
                    min = Math.min(min,arr[j]);
                }
                //2.배열에서 각각 업데이트를 해준다.
                for(int j = 0 ; j < 100; j ++){
                    if (arr[j] == max){
                        arr[j]--;
                        break;
                    }
                }
                for(int j = 0 ; j < 100; j ++){
                    if (arr[j] == min){
                        arr[j]++;
                        break;
                    }
                }
                //3.최대값과 최소값의 차이를 구한다. 이때 1이하면 멈춘다.
                for(int j = 0 ; j < 100; j ++){
                    max = Math.max(max,arr[j]);
                    min = Math.min(min,arr[j]);
                }
                ans = max - min;
                if (ans <= 1){
                    break;
                }
            }
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int i : arr) {
                max = Math.max(max,i);
                min = Math.min(min,i);
            }
            ans = max - min;

            System.out.println("#" + l  +" " +  ans);
        }
    }
}

