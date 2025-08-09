import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String target = sc.next();
        String[] split = target.split("\\*");
        String start = split[0];
        String end = split[1];
        while (n -- > 0){
            String str = sc.next();
            if (isCheck(str, start, end)){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
    static boolean isCheck(String str, String start, String end){
        String total = start + end;
        if (total.length() > str.length()) return false;
       return str.startsWith(start) && str.endsWith(end);
    }
}