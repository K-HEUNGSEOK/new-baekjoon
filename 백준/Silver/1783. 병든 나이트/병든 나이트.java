import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    static int n, m;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();

         if(n == 1){
             System.out.println(1);
         }else if(n == 2){
             System.out.println(Math.min(4, (m + 1) / 2 ));
         }else{
             if (m < 7){
                 System.out.println(Math.min(4,m));
             }else{
                 System.out.println(m-2);
             }
         }
    }
}