import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.util.*;

public class Solution {
    static int[] wallet = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

    static int[ ]arr;
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);

        //기본 세팅
        int T = sc.nextInt();
        for (int l = 1; l <= T; l++) {
            //코드 입력
           arr = new int[8];
            int money = sc.nextInt();
            //배열숫자랑, 총합
            DFS(0,money);
            System.out.println("#" + l + " ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }
    static void DFS(int v, int total){
        if (v >= 8){
            return;
        }else{
            if (total >= wallet[v]){
                arr[v] = total / wallet[v];
                DFS(v + 1 , total % wallet[v]);
            }else{
                DFS(v + 1 , total);
            }
        }
    }
}

