import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
   
        Scanner sc = new Scanner(System.in);

        //기본 세팅
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
            //코드 입력
            int P = sc.nextInt(); //1리터당 가격 A
            int Q = sc.nextInt(); //기본요금 B
            int R = sc.nextInt(); //이거 이하면 Q, 이상이면 Q + S
            int S = sc.nextInt(); //초과요금 1리터당 B
            int W = sc.nextInt(); //내가 쓴 요금

            int a = W * P;
            int b = 0;
            if (W <= R){
                b = Q;
            }else{
                int temp = W - R;
                b = temp * S + Q;
            }

            int num = Math.min(a,b);
            System.out.println("#" + l + " " + num);
        }


    }
}

