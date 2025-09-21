import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
 
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int z = 1; z <= T; z++) {
            int b = sc.nextInt();
            int n = 100;
            char[][] arr = new char[n+1][n+1];
            for (int i = 1; i <= n; i++) {
                String line = sc.next();
                for (int j = 1; j <= n; j++) {
                    arr[i][j] = line.charAt(j - 1);
                }
            }

            int ans = 1;
            //가로 버전
            for(int i = 1 ; i <= n ; i ++){
                for(int j = 1 ; j <= n ; j ++){
                    if (n - j + 1 <= ans) {
                        break; // 안쪽 for문(j)을 탈출
                    }
                    List<Character> list = new ArrayList<>();
                    for(int k  = j ; k <= n; k ++){
                        list.add(arr[i][k]);
                        //넣는 순간마다 점검해야함.
                        boolean flag = true;
                        for(int l = 0 ; l < list.size(); l ++){
                            if (list.get(l) != list.get(list.size()-1-l)){
                                flag = false;
                                break;
                            }
                        }
                        if (flag){
                            ans = Math.max(ans,list.size());
                        }
                    }
                }
            }


            for(int i = 1 ; i <= n ; i ++){
                for(int j = 1 ; j <= n ; j ++){
                    if (n - j + 1 <= ans) {
                        break; // 안쪽 for문(j)을 탈출
                    }
                    List<Character> list = new ArrayList<>();
                    for(int k  = j ; k <= n; k ++){
                        list.add(arr[k][i]);
                        //넣는 순간마다 점검해야함.
                        boolean flag = true;
                        for(int l = 0 ; l < list.size(); l ++){
                            if (list.get(l) != list.get(list.size()-1-l)){
                                flag = false;
                                break;
                            }
                        }
                        if (flag){
                            ans = Math.max(ans,list.size());
                        }
                    }
                }
            }
            System.out.println("#" + b + " " + ans);
        }
    }
}

