
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int[]target;

    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();

        target = new int[m];
        for(int i = 0 ; i < m ; i ++)target[i] = sc.nextInt();
        int cnt = 0;
        Arrays.sort(target);
        Arrays.sort(arr);
        boolean flag = true;
        for(int i = 0; i < n ; i ++){
            if(!check(arr[i])){
                sb.append(arr[i]).append(" ");
                cnt ++;
                flag =false;
            }
        }

        if(flag){
            System.out.println(0);
        }else {
            System.out.println(cnt);
            System.out.println(sb.toString());
        }
    }
    static boolean check(int num){
        int lt = 0;
        int rt = target.length-1;

        while(rt >= lt){
            int mid = (rt + lt) /2;

            if(target[mid] == num) return true;

            if(target[mid] > num){
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }
        return false;
    }
}