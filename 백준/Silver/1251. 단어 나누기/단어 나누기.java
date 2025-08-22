import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //무조건 3 단어로 나눠야함
        String ans = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        for(int i = 1; i < str.length()-1; i ++){
            for(int j = i + 1; j < str.length(); j ++){
                String a = str.substring(0,i);
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                String x1 = sb1.append(a).reverse().toString();
                String b = str.substring(i,j);
                String x2 = sb2.append(b).reverse().toString();
                String c = str.substring(j,str.length());
                String x3 = sb3.append(c).reverse().toString();

                String finalword = x1 + x2 + x3;
                if (finalword.compareTo(ans) < 0){
                    ans = finalword;
                }
            }
        }
        System.out.println(ans);
    }
}