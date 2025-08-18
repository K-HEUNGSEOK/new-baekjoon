import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];

        for(int i = 0 ; i < n ; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m ; j ++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int time = Integer.MAX_VALUE; //최대로 작게
        int height = Integer.MIN_VALUE; // 최대로 높게
        for(int v = 0 ; v <= 256; v ++){
            //v 층으로 통일할 때 최소 시간과 높이를 구해야함

            int removeBlock = 0; // 제거해야 할 대상 ->
            int buildBlock = 0; // 쌓아야 할 대상

            for(int i = 0 ; i < n ; i ++){
                for(int j = 0; j < m ; j ++){
                    if (arr[i][j] > v){
                        removeBlock += arr[i][j] - v;
                    }
                    if (arr[i][j] < v){
                        buildBlock += v - arr[i][j];
                    }
                }
            }

            //내가 갖고 있는 블럭이 쌓아야할 것 보다 많다면
            if (b + removeBlock >= buildBlock){
                int totalTime = removeBlock * 2 + buildBlock;
                if (totalTime <= time && height < v){
                    time = totalTime;
                    height = v;
                }
            }

        }
        System.out.println(time + " " + height);
    }
}