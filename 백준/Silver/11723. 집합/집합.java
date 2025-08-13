import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    static boolean[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        arr = new boolean[21];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < m ; i ++){
            String str = br.readLine();

            if (str.equals("all")){
                Arrays.fill(arr,true);
                arr[0] = false;
                continue;
            }
            if (str.equals("empty")){
                Arrays.fill(arr,false);
                continue;
            }

            String[] split = str.split(" ");
            isCheck(split[0], Integer.parseInt(split[1]));
        }
        System.out.println(sb.toString());
    }
    static void isCheck(String s, int n){
        switch (s){
            case "add":
                arr[n] = true;
                break;
            case "check":
                sb.append(arr[n] ? 1 : 0).append("\n");
                break;
            case "remove":
                arr[n] = false;
                break;
            case "toggle":
                arr[n] = !arr[n];
        }
    }
}