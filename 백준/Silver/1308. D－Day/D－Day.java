import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] start = s1.split(" ");
        String[] end = s2.split(" ");
        //윤년이면 그냥 하루를 추가하면 되네

        if (ggCheck(start[0], end[0], start[1], end[1], start[2], end[2])){
            System.out.println("gg");
            return;
        }

        //년도 별로 하지말고 일수로 통일해서 하는게 나음
       int ans = getDay(end[0], end[1], end[2]) - getDay(start[0], start[1], start[2]);
        System.out.println("D-" + (ans));
    }
    static int getDay(String s1, String s2, String s3){
        int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30,31,30,31};
        int[] m1 = {31, 29, 31, 30, 31, 30, 31, 31, 30,31,30,31};
        int year = Integer.parseInt(s1);
        int month = Integer.parseInt(s2);
        int day = Integer.parseInt(s3);

        int total = 0;

        //년수 계산
        for(int j = 1; j < year ; j++){
            if (dayCheck(j)){
                total += 366;
            }else {
                total += 365;
            }
        }

        //월 수 계산
        for(int i = 0 ; i < month-1; i ++){
            if (dayCheck(year)){
                total += m1[i];
            }else{
            total += m[i];
            }
        }
        //일수 계산
        total += day;

        return total;
    }

    static boolean ggCheck(String s1, String s2, String m1, String m2, String d1, String d2){
        int start = Integer.parseInt(s1);
        int end = Integer.parseInt(s2);
        if (end - start > 1000) return true;
        if (end - start == 1000){
            if (Integer.parseInt(m2) > Integer.parseInt(m1)){
                return true;
            }
            if (Integer.parseInt(m2) == Integer.parseInt(m1) &&  Integer.parseInt(d2) >= Integer.parseInt(d1) ){
                return true;
            }
        }
        return false;

    }
    static boolean dayCheck(int n){
        if (n % 400 == 0) return true;
        if (n % 100 == 0) return false;
        if (n % 4 == 0) return true;
        return false;
    }
}