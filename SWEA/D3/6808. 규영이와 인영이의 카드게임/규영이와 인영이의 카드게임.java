import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static int N = 18;
    static int[] arr;
    static boolean[] ch;
    static int[] card;
    static int ans1, ans2;
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z = 1; z <= T ; z ++){
            ch = new boolean[19];
            ans1 = 0; //이기는경우
            ans2 = 0; //지는경우
            arr = new int[9];
            for(int i = 0 ; i < 9; i ++){
                arr[i] = sc.nextInt();
                ch[arr[i]] = true;
            }
            card = new int[9];
            DFS(0);
            System.out.println("#" + z + " " + ans1 + " " + ans2);
        }
    }
    static void DFS(int v){
        if(v == 9){
            //여기서 체크
            int total1 = 0;
            int total2 = 0;
            for(int i = 0; i < 9; i ++){
                if(arr[i] > card[i]){
                    total1 += arr[i] + card[i];
                }else{
                    total2 += arr[i] + card[i];
                }
            }
            if(total1 > total2) ans1 ++;
            else if(total2 > total1) ans2 ++;
            return;
        }else{
            for(int i = 1 ; i <= 18; i ++){
                if(!ch[i]){
                    //이게 카드를 한장씩 먹었을 때
                    card[v] = i;
                    ch[i] = true;
                    DFS(v + 1);
                    ch[i] = false;
                }
            }
        }
    }
}


