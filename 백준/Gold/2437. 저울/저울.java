import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(java.lang.String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int total = 0;
        boolean flag = true;
        for(int i = 0; i < n ; i ++){
            if (total + 1 >= arr[i]){
                total += arr[i];
            }else{
                total += 1;
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println(total += 1);
        }else{
        System.out.println(total);
        }
    }
}