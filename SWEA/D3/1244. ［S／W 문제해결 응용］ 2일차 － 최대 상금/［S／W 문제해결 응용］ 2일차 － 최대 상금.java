import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Solution {
    static int max;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int start = 1 ; start <= T; start ++){
            String str = sc.next(); //처음 들어오는 숫자
            int change = sc.nextInt(); //교환횟수

            max = 0; // 최대값 갱신용도
            visited = new boolean[change + 1][1000000]; //몇번의 기회인지와 숫자의 최대값 작성

            int[] arr = new int[str.length()]; //바꾸기 쉽게 int 배열로 생성
            for(int i = 0 ; i < arr.length; i ++){
                arr[i] = str.charAt(i)-'0';
            }

            //교환 횟수, 배열, 교환해야하는 횟수, 처음 값 집어넣고 조합을 돌린다.
            DFS(0,arr, change,Integer.parseInt(str));
            sb.append("#" + start + " " + max).append("\n");
        }
        System.out.println(sb.toString());
    }
    static void DFS(int v, int[] arr,int change, int current){
        if (visited[v][current]) return;
        visited[v][current] = true;
        if (v == change){
            if (current > max){
                max = current;
                return;
            }
        }else{
            for(int i = 0 ; i < arr.length; i ++){
                for(int j =  i + 1; j < arr.length; j ++){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    StringBuilder sb = new StringBuilder();
                    for (int i1 : arr) {
                        sb.append(i1);
                    }

                    DFS(v + 1, arr, change, Integer.parseInt(sb.toString()));
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}