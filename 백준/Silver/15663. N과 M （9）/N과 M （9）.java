
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n,m;
    static int[] arr, param;
    static boolean[] ch;
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        param = new int[m];
        ch = new boolean[n];
        for(int i = 0 ; i < n ;  i ++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        DFS(0);
    }
    static void DFS(int v){
        if(v == m){
            for(int i = 0 ; i < m; i ++){
                System.out.print(param[i] + " ");
            }
            System.out.println();
        }else{
            int last = 0;
            for(int i = 0; i < n; i ++){
                if(!ch[i] && last != arr[i]){
                    last = arr[i];
                    ch[i] = true;
                    param[v] = arr[i];
                    DFS(v + 1);
                    ch[i] = false;
                }
            }
        }
    }
}