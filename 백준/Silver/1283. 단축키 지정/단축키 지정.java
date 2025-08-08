import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    static boolean[] alphabet = new boolean[26];

    public static void main(String[] args) throws IOException {
  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.println(check(str));
        }

    }
    static String check(String str){
        String[] split = str.split(" ");
        boolean flag = false;
        int index = -1;
        //1순위 각단어의 첫글자부터 확인
        for(int i = 0 ; i < split.length; i ++){
            String s = split[i];
            if (!alphabet[getInt(s.charAt(0))]){
                alphabet[getInt(s.charAt(0))] = true;
                flag = true;
                index = i;
                break;
            }
        }
        //이게 1순위
        if (flag){
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < split.length; i ++){
                if (i == index){
                    sb.append('[').append(split[i].charAt(0)).append(']').
                            append(split[i].substring(1)).append(" ");
                }else{
                    sb.append(split[i]).append(" ");
                }
            }
            return sb.toString();
        }
        //2순위
        int newIndex = -1;
        for(int i = 0 ; i < str.length(); i ++){
            if (str.charAt(i) != ' ' && !alphabet[getInt(str.charAt(i))]){
                alphabet[getInt(str.charAt(i))] = true;
                newIndex = i;
                flag = true;
                break;
            }
        }
        if (flag){
            StringBuilder result = new StringBuilder();
            for(int i = 0 ; i < str.length(); i ++){
                if (i == newIndex){
                    result.append('[').append(str.charAt(i)).append(']');
                }else{
                    result.append(str.charAt(i));
                }
            }
            return result.toString();
        }
        return str;
    }

    //불리언 배열 확인용
    static int getInt(char a) {
        return (int) (Character.toLowerCase(a) - 'a');
    }
}