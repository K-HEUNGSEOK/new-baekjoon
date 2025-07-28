import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static int[] dist = new int[6];
    public static void main(java.lang.String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        //k 개의 숫자로 이루어진개 나오면 6개로 짤라서 출력하고 백트래킹해주면 된다.
        while (true){
            n = sc.nextInt();
            if (n == 0) return;
            arr = new int[n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            DFS(0,0);
            System.out.println();
        }
    }
    static void DFS(int v,int start){
        if (v  == 6){
            for(int i = 0 ; i < 6; i ++){
                System.out.print(dist[i] +" ");
            }
            System.out.println();
        }else{
            for(int i = start ; i < n ; i ++){
                    dist[v] = arr[i];
                    DFS(v+1,i+1);
            }
        }
    }
}