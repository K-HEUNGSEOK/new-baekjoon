import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int total = 0;
        String[] split = str.split("-");
        total += isCheck(split[0]);

        for(int i = 1;  i < split.length; i ++){
            total -= isCheck(split[i]);
        }
        System.out.println(total);
    }

    static int isCheck(String str){
        String[] split = str.split("\\+");
        int total = 0;
        for (String s : split) {
            total += Integer.parseInt(s);
        }
        return total;
    }
}