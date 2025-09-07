import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int[] s,b;
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = new int[n];
        b = new int[n];
        for(int i = 0 ; i < n ; i ++){
            s[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        //s는 곱하고 b는 더한다. 이후 두개를 빼고 ans 의 최솟값을 구해라
        DFS(0, 1, 0);
        System.out.println(ans);
    }
    static void DFS(int v,int sN, int bN){
        if (v == n){
            if (bN == 0 ) return;
            ans = Math.min(ans,Math.abs(sN - bN));
            return;
        }else{
            DFS(v+1 , sN * s[v], bN + b[v]);
            DFS(v+1, sN, bN);
        }
    }
}