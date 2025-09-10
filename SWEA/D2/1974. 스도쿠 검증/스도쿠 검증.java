import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z = 1; z <= T; z ++) {
            int n = 9;
            boolean flag = true;
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i = 0 ; i < n ; i ++){
                int[] width = new int[10];
                int[] height = new int[10];
                for(int j = 0 ; j < n ; j ++){
                    width[arr[i][j]] ++;
                    height[arr[j][i]] ++;
                }

                for(int k = 1; k < 10; k ++){
                    if (width[k] != 1 || height[k]!= 1){
                        flag = false;
                        break;
                    }
                }
            }


            if (flag) {
                for (int i = 0; i < n; i += 3) {
                    for (int j = 0; j < n; j += 3) {
                        int[] check = new int[10];
                        for (int k = i; k < i + 3; k++) {
                            for (int l = j; l < j + 3; l++) {
                                if (k > n) continue;
                                int index = arr[k][l];
                                check[index]++;
                            }
                        }

                        for(int ch = 1; ch <= 9; ch ++){
                            if (check[ch] != 1){
                                flag = false;
                                break;
                            }
                        }
                        if (!flag) break;
                    }
                }
            }


            System.out.print("#" + z +" ");
            if (flag) System.out.println(1);
            else System.out.println(0);
        }
    }
}
