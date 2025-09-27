import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean[] col1, col2, col3;
    static int n, ans;
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {

            ans = 0;
             n = sc.nextInt();
            col1 = new boolean[n]; //세로
            col2 = new boolean[2 * n - 1]; // 
            col3 = new boolean[2 * n - 1]; // 
            DFS(0);

            System.out.println("#" + z + " " + ans);

        }
    }
    static void DFS(int v){
        if (v == n){
            ans ++;
            return;
        }else{
            for(int i = 0; i < n; i ++){
                if (!col1[i] && !col2[v + i] && !col3[v - i + (n-1)]){
                    col1[i] = true;
                    col2[v + i] = true;
                    col3[v-i + (n-1)] = true;
                    DFS(v + 1);
                    col1[i] = false;
                    col2[v + i] = false;
                    col3[v-i + (n-1)] = false;
                }
            }
        }
    }
}


